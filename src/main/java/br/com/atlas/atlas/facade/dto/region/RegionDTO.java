package br.com.atlas.atlas.facade.dto.region;

import lombok.*;

import java.io.Serializable;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(toBuilder = true)
@Getter
@Setter
public class RegionDTO implements Serializable {

    private Long id;

    private String name;
}
