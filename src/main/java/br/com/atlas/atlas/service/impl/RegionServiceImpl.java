package br.com.atlas.atlas.service.impl;

import br.com.atlas.atlas.domain.Region;
import br.com.atlas.atlas.repository.RegionRepository;
import br.com.atlas.atlas.service.RegionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RegionServiceImpl implements RegionService {

    private final RegionRepository regionRepository;

    @Override
    public Region createRegion(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public Optional<Region> findRegionByname(String name) {
        return regionRepository.findByName(name);
    }

    @Override
    public List<Region> getRegions() {
        return regionRepository.findAll();
    }

    @Override
    public Optional<Region> getRegionById(Long id) {
        return regionRepository.findById(id);
    }

    @Override
    public Region update(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public void delete(Region region) {
        regionRepository.delete(region);
    }
}
