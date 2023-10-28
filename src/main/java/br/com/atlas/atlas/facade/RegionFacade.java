package br.com.atlas.atlas.facade;


import br.com.atlas.atlas.context.RegionContext;
import br.com.atlas.atlas.domain.Region;
import br.com.atlas.atlas.facade.dto.region.RegionCreateDTO;
import br.com.atlas.atlas.facade.dto.region.RegionDTO;
import br.com.atlas.atlas.facade.dto.region.RegionPatchDTO;
import br.com.atlas.atlas.facade.mapper.RegionMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class RegionFacade {

    private final RegionMapper regionMapper;
    private final RegionContext regionContext;

    @Transactional()
    public RegionDTO createRegion(RegionCreateDTO dto){
        Region regionToCreate = regionMapper.toEntity(dto);
        Region regionCreated = regionContext.createRegion(regionToCreate);
        return regionMapper.toDto(regionCreated);
    }

    public List<RegionDTO> getAllRegions(){
        List<Region> allRegions = regionContext.getAll();
        return regionMapper.toDto(allRegions);
    }

    public RegionDTO getRegion(Long id){
        Region region = regionContext.getRegionById(id);
        return regionMapper.toDto(region);
    }

    @Transactional()
    public RegionDTO patchRegion(Long id, RegionPatchDTO dto){
        Region region = regionContext.patchRegion(id, dto);
        return regionMapper.toDto(region);
    }

    @Transactional()
    public void deleteRegion(Long id){
        regionContext.deleteRegion(id);
    }

}
