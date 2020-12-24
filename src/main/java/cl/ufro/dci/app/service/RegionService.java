package cl.ufro.dci.app.service;

import cl.ufro.dci.app.model.Region;
import cl.ufro.dci.app.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public void save(Region nuevaRegion){
        regionRepository.save(nuevaRegion);
    }
}
