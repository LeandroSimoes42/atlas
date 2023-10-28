package br.com.atlas.atlas.facade;

import br.com.atlas.atlas.context.ConsultantContext;
import br.com.atlas.atlas.domain.Consultant;
import br.com.atlas.atlas.facade.dto.consultant.ConsultantCreateDTO;
import br.com.atlas.atlas.facade.dto.consultant.ConsultantDTO;
import br.com.atlas.atlas.facade.mapper.ConsultantMapper;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@AllArgsConstructor
public class ConsultantFacade {

    private final ConsultantMapper consultantMapper;
    private final ConsultantContext consultantContext;

    @Transactional()
    public ConsultantDTO createConsultant(ConsultantCreateDTO dto){
        Consultant consultant = consultantMapper.toEntity(dto);
        return ConsultantDTO.builder().build();
    }
}
