package org.dansmultipro.ams.amsapp.controller;

import org.dansmultipro.ams.amsapp.dto.CreateResponseDto;
import org.dansmultipro.ams.amsapp.dto.DeleteResponseDto;
import org.dansmultipro.ams.amsapp.dto.UpdateResponseDto;
import org.dansmultipro.ams.amsapp.dto.assets.AssetsResponseDto;
import org.dansmultipro.ams.amsapp.dto.assets.AddAssetsRequestDto;
import org.dansmultipro.ams.amsapp.dto.assets.UpdateAssetsRequestDto;
import org.dansmultipro.ams.amsapp.dto.assets.typeandstatus.AssetsStatusResponseDto;
import org.dansmultipro.ams.amsapp.dto.assets.typeandstatus.AssetsTypeResponseDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/assets")
public class AssetsController {

    @GetMapping
    public List<AssetsResponseDto> getAssets() {
        return null;
    }

    @GetMapping("/{id}")
    public AssetsResponseDto getAssetById(@PathVariable String id) {
        return null;
    }

    @PostMapping
    public CreateResponseDto addAsset(@RequestBody AddAssetsRequestDto request) {
        return null;
    }

    @PutMapping("/{id}")
    public UpdateResponseDto updateAsset(@PathVariable String id,
                                         @RequestBody UpdateAssetsRequestDto request) {
        return null;
    }

    @DeleteMapping("/{id}")
    public DeleteResponseDto deleteAssets(@PathVariable String id) {
        return null;
    }
}
