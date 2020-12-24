package cl.ufro.dci.app.repository;

import cl.ufro.dci.app.model.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends CrudRepository<Region, Long> {
}
