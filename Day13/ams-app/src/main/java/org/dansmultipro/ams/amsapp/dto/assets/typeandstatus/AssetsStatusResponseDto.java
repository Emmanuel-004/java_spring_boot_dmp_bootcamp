package org.dansmultipro.ams.amsapp.dto.assets.typeandstatus;

public class AssetsStatusResponseDto {
    private String id;
    private String statusName;
    private String statusCode;

    public AssetsStatusResponseDto() {
    }

    public String getId() {
        return id;
    }

    public String getStatusName() {
        return statusName;
    }

    public String getStatusCode() {
        return statusCode;
    }
}
