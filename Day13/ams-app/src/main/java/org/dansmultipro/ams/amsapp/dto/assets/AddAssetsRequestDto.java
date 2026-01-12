package org.dansmultipro.ams.amsapp.dto.assets;

public class AddAssetsRequestDto {
    private String code;
    private String name;
    private String companyId;
    private String assetTypeId;
    private String assetStatusId;
    private String expirationDate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getAssetTypeId() {
        return assetTypeId;
    }

    public void setAssetTypeId(String assetTypeId) {
        this.assetTypeId = assetTypeId;
    }

    public String getAssetStatusId() {
        return assetStatusId;
    }

    public void setAssetStatusId(String assetStatusId) {
        this.assetStatusId = assetStatusId;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
