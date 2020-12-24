package cl.ufro.dci.app.repository;

import cl.ufro.dci.app.model.Paciente;
import cl.ufro.dci.app.model.PersonalMedico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalMedicoRepository extends CrudRepository<PersonalMedico, Long> {
}
