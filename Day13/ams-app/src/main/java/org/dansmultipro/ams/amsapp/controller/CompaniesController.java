package org.dansmultipro.ams.amsapp.controller;

import org.dansmultipro.ams.amsapp.dto.CreateResponseDto;
import org.dansmultipro.ams.amsapp.dto.DeleteResponseDto;
import org.dansmultipro.ams.amsapp.dto.UpdateResponseDto;
import org.dansmultipro.ams.amsapp.dto.company.CompaniesResponseDto;
import org.dansmultipro.ams.amsapp.dto.company.CompaniesRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/companies/")
public class CompaniesController {

    @GetMapping
    public List<CompaniesResponseDto> getCompanies() {
        return null;
    }

    @GetMapping("/{id}")
    public CompaniesResponseDto getCompanyById(@PathVariable String id) {
        return null;
    }

    @PostMapping
    public CreateResponseDto addCompany(@RequestBody CompaniesRequestDto request) {
        return null;
    }

    @PutMapping("/{id}")
    public UpdateResponseDto updateCompany(@PathVariable String id,
                                           @RequestBody CompaniesRequestDto request) {
        return null;
    }

    @DeleteMapping("/{id}")
    public DeleteResponseDto deleteCompany(@PathVariable String id) {
        return null;
    }
}
