package br.com.atlas.atlas.service;

import br.com.atlas.atlas.domain.Consultant;
import org.springframework.stereotype.Service;

@Service
public interface ConsultantService {

    Consultant create(Consultant consultant);
}
