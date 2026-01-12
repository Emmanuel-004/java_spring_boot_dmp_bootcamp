package org.dansmultipro.ams.amsapp.controller;

import org.dansmultipro.ams.amsapp.dto.assets.typeandstatus.AssetsTypeResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/assets-types")
public class AssetsTypeController {

    @GetMapping()
    public List<AssetsTypeResponseDto> getAssetsTypes() {
        return null;
    }

    @GetMapping("/{id}")
    public AssetsTypeResponseDto getAssetTypeById(@PathVariable String id) {
        return null;
    }
}
