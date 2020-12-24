package cl.ufro.dci.app.repository;

import cl.ufro.dci.app.model.Establecimiento;
import cl.ufro.dci.app.model.EstadoPaciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoPacienteRepository extends CrudRepository<EstadoPaciente, Long> {
}
