package org.dansmultipro.ams.amsapp.controller;

import org.dansmultipro.ams.amsapp.dto.CreateResponseDto;
import org.dansmultipro.ams.amsapp.dto.DeleteResponseDto;
import org.dansmultipro.ams.amsapp.dto.UpdateResponseDto;
import org.dansmultipro.ams.amsapp.dto.employees.EmployeesRequestDto;
import org.dansmultipro.ams.amsapp.dto.employees.EmployeesResponseDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeesController {

    @GetMapping
    public List<EmployeesResponseDto> getEmployees() {
        return null;
    }

    @GetMapping("/{id}")
    public EmployeesResponseDto getEmployeesById(@PathVariable String id) {
        return null;
    }

    @PostMapping
    public CreateResponseDto addEmployee(@RequestBody EmployeesRequestDto request){
        return null;
    }

    @PutMapping("/{id}")
    public UpdateResponseDto updateEmployee(@PathVariable String id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public DeleteResponseDto deleteEmployee(@PathVariable String id) {
        return null;
    }
}
