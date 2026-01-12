package org.dansmultipro.ams.amsapp.controller;

import org.dansmultipro.ams.amsapp.dto.CreateResponseDto;
import org.dansmultipro.ams.amsapp.dto.DeleteResponseDto;
import org.dansmultipro.ams.amsapp.dto.UpdateResponseDto;
import org.dansmultipro.ams.amsapp.dto.auth.RegisterRequestDto;
import org.dansmultipro.ams.amsapp.dto.users.roles.RolesResponseDto;
import org.dansmultipro.ams.amsapp.dto.users.UpdatePasswordRequestDto;
import org.dansmultipro.ams.amsapp.dto.users.UpdateUserRequestDto;
import org.dansmultipro.ams.amsapp.dto.users.UserResponseDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @GetMapping
    public List<UserResponseDto> getUsers() {
        return null;
    }

    @GetMapping("/{id}")
    public UserResponseDto getUserById(@PathVariable String id) {
        return null;
    }

    @PostMapping
    public CreateResponseDto register(@RequestBody RegisterRequestDto request) {
        return null;
    }

    @PutMapping("/{id}")
    public UpdateResponseDto updateUser(@PathVariable String id,
                                        @RequestBody UpdateUserRequestDto request) {
        return null;
    }

    @PatchMapping("/change-password")
    public UpdateResponseDto changeUserPassword(@RequestBody UpdatePasswordRequestDto request) {
        return null;
    }

    @DeleteMapping("/{id}")
    public DeleteResponseDto deleteUser(@PathVariable String id) {
        return null;
    }
}
