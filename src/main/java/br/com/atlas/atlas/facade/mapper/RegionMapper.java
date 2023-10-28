package br.com.atlas.atlas.facade.mapper;

import br.com.atlas.atlas.domain.Region;
import br.com.atlas.atlas.facade.dto.region.RegionCreateDTO;
import br.com.atlas.atlas.facade.dto.region.RegionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RegionMapper extends EntityMapper<RegionDTO, Region> {

    Region toEntity(RegionCreateDTO dto);

}
