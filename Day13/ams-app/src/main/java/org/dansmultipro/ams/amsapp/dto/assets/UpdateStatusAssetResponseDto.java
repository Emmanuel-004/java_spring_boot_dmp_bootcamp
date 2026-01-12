package org.dansmultipro.ams.amsapp.dto.assets;

public class UpdateStatusAssetResponseDto {
    private String id;
    private String assetName;
    private String statusName;

    public UpdateStatusAssetResponseDto() {
    }

    public String getId() {
        return id;
    }

    public String getAssetName() {
        return assetName;
    }

    public String getStatusName() {
        return statusName;
    }
}
