package br.com.atlas.atlas.context.impl;

import br.com.atlas.atlas.context.ConsultantContext;
import br.com.atlas.atlas.domain.Consultant;
import br.com.atlas.atlas.service.ConsultantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConsultantContextImpl implements ConsultantContext {

    private final ConsultantService consultantService;
    @Override
    public Consultant create(Consultant consultant) {
        return consultantService.create(consultant);
    }
}
