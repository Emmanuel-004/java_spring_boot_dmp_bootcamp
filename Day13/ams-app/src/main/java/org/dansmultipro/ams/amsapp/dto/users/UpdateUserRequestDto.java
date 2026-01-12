package org.dansmultipro.ams.amsapp.dto.users;

public class UpdateUserRequestDto {
    private String email;
    private Integer version;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
