package br.com.atlas.atlas.context;

import br.com.atlas.atlas.domain.Region;
import br.com.atlas.atlas.facade.dto.region.RegionPatchDTO;

import java.util.List;

public interface RegionContext {

    Region createRegion(Region region);

    List<Region> getAll();

    Region getRegionById(Long id);

    Region patchRegion(Long id, RegionPatchDTO dto);

    void deleteRegion(Long id);
}
