package org.dansmultipro.ams.amsapp.controller;

import org.dansmultipro.ams.amsapp.dto.UpdateResponseDto;
import org.dansmultipro.ams.amsapp.dto.locations.LocationsRequestDto;
import org.dansmultipro.ams.amsapp.dto.locations.LocationsResponseDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/locations")
public class LocationsController {

    @GetMapping
    public List<LocationsResponseDto> getLocations() {
        return null;
    }

    @GetMapping("/{id}")
    public LocationsResponseDto getLocationById() {
        return null;
    }

    @PostMapping
    public LocationsResponseDto addLocation(@RequestBody LocationsRequestDto request) {
        return null;
    }

    @PostMapping
    public UpdateResponseDto updateLocation(@PathVariable String id,
                                            @RequestBody LocationsRequestDto request) {
        return null;
    }

    @DeleteMapping("/{id}")
    public DeleteMapping deleteLocation(@PathVariable String id) {
        return null;
    }
}
