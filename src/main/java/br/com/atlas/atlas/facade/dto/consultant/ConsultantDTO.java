package br.com.atlas.atlas.facade.dto.consultant;

import br.com.atlas.atlas.domain.Records;
import br.com.atlas.atlas.domain.Region;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsultantDTO {

    private Long id;

    private String name;

    private List<Region> region;

    private List<Records> records;
}
