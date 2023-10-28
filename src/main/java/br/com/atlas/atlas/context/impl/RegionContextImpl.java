package br.com.atlas.atlas.context.impl;

import br.com.atlas.atlas.context.RegionContext;
import br.com.atlas.atlas.domain.Region;
import br.com.atlas.atlas.facade.dto.region.RegionPatchDTO;
import br.com.atlas.atlas.service.RegionService;
import br.com.atlas.atlas.service.enumeration.ErrorConstants;
import br.com.atlas.atlas.service.exception.BusinessException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RegionContextImpl implements RegionContext {

    private final RegionService regionService;

    @Override
    public Region createRegion(Region region) {
        Optional<Region> existRegion = regionService.findRegionByname(region.getName());

        BusinessException.throwIf(
                existRegion.isPresent(),
                ErrorConstants.REGION_EXIST
        );

        return regionService.createRegion(region);
    }

    @Override
    public List<Region> getAll() {
        return regionService.getRegions();
    }

    @Override
    public Region getRegionById(Long id) {
        Optional<Region> region = regionService.getRegionById(id);
        BusinessException.throwIf(
                region.isEmpty(),
                ErrorConstants.NOT_FOUND
        );
        return region.get();
    }

    @Override
    public Region patchRegion(Long id, RegionPatchDTO dto) {
        Optional<Region> region = regionService.getRegionById(id);
        BusinessException.throwIf(
                region.isEmpty(),
                ErrorConstants.NOT_FOUND
        );
        region.get().setName(dto.getName());
        return regionService.update(region.get());
    }

    @Override
    public void deleteRegion(Long id) {
        Optional<Region> region = regionService.getRegionById(id);
        BusinessException.throwIf(
                region.isEmpty(),
                ErrorConstants.NOT_FOUND
        );
        regionService.delete(region.get());
    }
}
