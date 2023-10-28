package br.com.atlas.atlas.controller;

import br.com.atlas.atlas.facade.ConsultantFacade;
import br.com.atlas.atlas.facade.dto.consultant.ConsultantCreateDTO;
import br.com.atlas.atlas.facade.dto.consultant.ConsultantDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ConsultantController {

    private final ConsultantFacade consultantFacade;


    @PostMapping("/consultant/")
    public ResponseEntity<ConsultantDTO> createConsultant(@RequestBody @Valid ConsultantCreateDTO dto) throws URISyntaxException {
        ConsultantDTO createdConsultant = consultantFacade.createConsultant(dto);
        return ResponseEntity.created(new URI( "/consultant/" + createdConsultant.getId())).body(createdConsultant);
    }
}
