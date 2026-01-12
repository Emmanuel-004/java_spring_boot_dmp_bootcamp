package org.dansmultipro.ams.amsapp.dto.auth;

public class LoginResponseDto {
    private String name;
    private String roleName;
    private String token;

    public LoginResponseDto() {
    }

    public String getName() {
        return name;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getToken() {
        return token;
    }
}
