package br.com.atlas.atlas.controller;

import br.com.atlas.atlas.facade.RegionFacade;
import br.com.atlas.atlas.facade.dto.region.RegionCreateDTO;
import br.com.atlas.atlas.facade.dto.region.RegionDTO;
import br.com.atlas.atlas.facade.dto.region.RegionPatchDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class RegionController {

    private final RegionFacade regionFacade;

    @PostMapping("/region")
    public ResponseEntity<RegionDTO> createRegion(@RequestBody @Valid RegionCreateDTO dto) throws URISyntaxException {
        RegionDTO regionDTO = regionFacade.createRegion(dto);
        return ResponseEntity.created(new URI("/region/" + regionDTO.getId())).body(regionDTO);
    }

    @GetMapping("/region")
    public ResponseEntity<List<RegionDTO>> getRegions() {
        List<RegionDTO> regionsDTO = regionFacade.getAllRegions();
        return ResponseEntity.ok().body(regionsDTO);
    }

    @GetMapping("/region/{id}")
    public ResponseEntity<RegionDTO> getRegion(@PathVariable Long id) {
        RegionDTO region = regionFacade.getRegion(id);
        return ResponseEntity.ok().body(region);
    }

    @PatchMapping("/region/{id}")
    public ResponseEntity<RegionDTO> patchRegion(@PathVariable Long id, @RequestBody @Valid RegionPatchDTO dto) {
        RegionDTO region = regionFacade.patchRegion(id, dto);
        return ResponseEntity.ok().body(region);
    }

    @DeleteMapping("/region/{id}")
    public ResponseEntity<Void> deleteRegion(@PathVariable Long id) {
        regionFacade.deleteRegion(id);
        return ResponseEntity.noContent().build();
    }

}
