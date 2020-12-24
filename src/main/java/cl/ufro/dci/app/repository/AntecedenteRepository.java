package cl.ufro.dci.app.repository;

import cl.ufro.dci.app.model.Antecedente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AntecedenteRepository extends CrudRepository<Antecedente, Long> {
}
