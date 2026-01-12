package org.dansmultipro.ams.amsapp.controller;

import org.dansmultipro.ams.amsapp.dto.CreateResponseDto;
import org.dansmultipro.ams.amsapp.dto.auth.LoginRequestDto;
import org.dansmultipro.ams.amsapp.dto.auth.LoginResponseDto;
import org.dansmultipro.ams.amsapp.dto.auth.RegisterRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/login")
public class AuthController {

    @PostMapping
    public LoginResponseDto login(@RequestBody LoginRequestDto request){
        return null;
    }
}
