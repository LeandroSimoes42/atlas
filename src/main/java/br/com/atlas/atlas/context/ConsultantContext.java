package br.com.atlas.atlas.context;

import br.com.atlas.atlas.domain.Consultant;
import org.springframework.stereotype.Service;

@Service
public interface ConsultantContext {

    Consultant create(Consultant consultant);
}
