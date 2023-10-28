package br.com.atlas.atlas.service.impl;

import br.com.atlas.atlas.domain.Consultant;
import br.com.atlas.atlas.repository.ConsultantRepository;
import br.com.atlas.atlas.service.ConsultantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConsultantServiceImpl implements ConsultantService {

    private final ConsultantRepository consultantRepository;
    @Override
    public Consultant create(Consultant consultant) {
        return consultantRepository.save(consultant);
    }
}
