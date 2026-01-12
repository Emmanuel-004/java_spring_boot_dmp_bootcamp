package org.dansmultipro.ams.amsapp.controller;

import org.dansmultipro.ams.amsapp.dto.users.roles.RolesResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/roles")
public class RolesController {

    @GetMapping
    public List<RolesResponseDto> getRoles(){
        return null;
    }

    @GetMapping("/{id}")
    public RolesResponseDto getRoleById(@PathVariable String id){
        return null;
    }
}
