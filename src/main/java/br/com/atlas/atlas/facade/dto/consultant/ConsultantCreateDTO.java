package br.com.atlas.atlas.facade.dto.consultant;

import br.com.atlas.atlas.domain.Region;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsultantCreateDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String region_id;


}
