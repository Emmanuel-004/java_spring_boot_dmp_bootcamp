package org.dansmultipro.ams.amsapp.controller;

import org.dansmultipro.ams.amsapp.dto.assets.typeandstatus.AssetsStatusResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/assets-status")
public class AssetsStatusController {

    @GetMapping()
    public List<AssetsStatusResponseDto> getAssetsStatus() {
        return null;
    }

    @GetMapping("/{id}")
    public AssetsStatusResponseDto getAssetStatusById(@PathVariable String id) {
        return null;
    }
}
