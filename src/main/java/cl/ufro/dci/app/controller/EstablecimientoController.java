package cl.ufro.dci.app.controller;

import cl.ufro.dci.app.model.Comuna;
import cl.ufro.dci.app.model.Establecimiento;
import cl.ufro.dci.app.service.ComunaService;
import cl.ufro.dci.app.service.EstablecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/establecimiento")
public class EstablecimientoController {

    @Autowired
    private EstablecimientoService establecimientoService;

    @Autowired
    private ComunaService comunaService;

    /**
     * Método que permite agregar registros de establecimientos.
     * @param nombre
     * @param direccion
     * @return String con mensaje si es que se agrega
     */
    @PostMapping("/agregar/{nombre}/{direccion}")
    @ResponseBody
    public String agregar(@PathVariable String nombre, @PathVariable String direccion){
        Establecimiento establecimiento = new Establecimiento(nombre,direccion,null,null);
        establecimientoService.guardar(establecimiento);
        return "El establecimiento se ha agregado correctamente.";
    }

    /**
     * Método que permite buscar registros de establecimientos.
     * @param idEstablecimiento
     * @return null en caso que no se encuentre el registro buscado o el objeto en caso que se encuentre.
     */
    @GetMapping("/buscar")
    public Establecimiento buscar(@RequestParam ("est_id") Long idEstablecimiento){
        if (establecimientoService.find(idEstablecimiento).isEmpty()) {
            return null;
        } else {
            return establecimientoService.find(idEstablecimiento).get();
        }
    }

    /**
     * Método que permite listar los registros de establecimiento.
     */
    @GetMapping("/listar")
    public Iterable<Establecimiento> listar(){
        return establecimientoService.listarTodo();
    }

    /**
     * Método que permite eliminar un registro de establecimiento.
     * @param idEstablecimiento
     * @return String con mensaje en caso que se elimine o no el registro de establecimiento.
     */
    @DeleteMapping("/eliminar/{idEstablecimiento}")
    public String eliminar(@PathVariable ("idEstablecimiento") Long idEstablecimiento){
        if (establecimientoService.find(idEstablecimiento).isEmpty()){
            return null;
        } else {
            establecimientoService.eliminar(idEstablecimiento);
        }
        return "Se ha eliminado correctamente";
    }

    /**
     * Método que permite editar un registro de un establecimiento.
     * @param idEstablecimiento
     * @param establecimiento
     * @return String con mensaje en caso que se edite o no el registro de establecimiento.
     */
    @PutMapping("/editar/{idEstablecimiento}")
    public String editar(@PathVariable ("idEstablecimiento") Long idEstablecimiento, @RequestBody Establecimiento establecimiento) {
        if (establecimientoService.existById(idEstablecimiento)) {
            establecimientoService.editarNombre(idEstablecimiento, establecimiento.getEstNombre());
            establecimientoService.editarDireccion(idEstablecimiento, establecimiento.getEstDireccion());
            establecimientoService.editarComuna(idEstablecimiento, establecimiento.getComuna());

            return "El establecimiento se ha cambiado correctamente.";
        }
        return "No se ha podido editar el establecimiento.";
    }

}
