package br.com.atlas.atlas.service;

import br.com.atlas.atlas.domain.Region;

import java.util.List;
import java.util.Optional;

public interface RegionService {

    Region createRegion(Region region);
    Optional<Region> findRegionByname(String name);

    List<Region> getRegions();

    Optional<Region> getRegionById(Long id);

    Region update(Region region);

    void delete(Region region);

}
