package org.dansmultipro.ams.amsapp.dto.assets;

public class AssetsResponseDto {
    private String id;
    private String code;
    private String assetName;
    private String companyName;
    private String typeName;
    private String statusName;
    private String expirationDate;
    private Integer version;

    public AssetsResponseDto() {
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getAssetName() {
        return assetName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getStatusName() {
        return statusName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public Integer getVersion() {
        return version;
    }
}
