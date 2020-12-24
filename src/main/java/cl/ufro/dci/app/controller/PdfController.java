package cl.ufro.dci.app.controller;
import cl.ufro.dci.app.helpers.PdfReport;
import cl.ufro.dci.app.model.*;
import cl.ufro.dci.app.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pdf")
public class PdfController {

    @Autowired
    private PacienteRepository pacienteRepository;

    //para generar el pdf se debe ingresar a la ruta http://localhost:8080/pdf/generar/
    @PostMapping(path="/generar/{pacRut}/")
    public void generarPdf(@PathVariable("pacRut") Long pacRut){
        Paciente paciente = pacienteRepository.findById(pacRut).get();
        PdfReport pdf = new PdfReport();
        pdf.generarPDF(paciente);
    }
}
