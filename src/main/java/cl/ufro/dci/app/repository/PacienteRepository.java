package cl.ufro.dci.app.repository;

import cl.ufro.dci.app.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
