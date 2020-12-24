package cl.ufro.dci.app.repository;

import cl.ufro.dci.app.model.Caso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasoRepository extends CrudRepository<Caso, Long> {
}
