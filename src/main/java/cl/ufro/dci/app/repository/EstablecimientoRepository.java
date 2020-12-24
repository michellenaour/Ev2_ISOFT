package cl.ufro.dci.app.repository;

import cl.ufro.dci.app.model.Establecimiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstablecimientoRepository extends CrudRepository<Establecimiento, Long> {

}
