package org.dansmultipro.ams.amsapp.dto.users;

public class UserResponseDto {
    private String id;
    private String fullName;
    private String role;
    private String email;

    public UserResponseDto() {
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }
}
