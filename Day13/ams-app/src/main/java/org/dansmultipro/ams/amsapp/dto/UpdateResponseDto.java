package org.dansmultipro.ams.amsapp.dto;

public class UpdateResponseDto {
    private String id;
    private Integer version;
    private String message;

    public UpdateResponseDto() {
    }

    public String getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    public String getMessage() {
        return message;
    }
}
