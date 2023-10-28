package br.com.atlas.atlas.facade.mapper;

import br.com.atlas.atlas.domain.Consultant;
import br.com.atlas.atlas.facade.dto.consultant.ConsultantCreateDTO;
import br.com.atlas.atlas.facade.dto.consultant.ConsultantDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Component
public interface ConsultantMapper extends EntityMapper<ConsultantDTO, Consultant>{

}
