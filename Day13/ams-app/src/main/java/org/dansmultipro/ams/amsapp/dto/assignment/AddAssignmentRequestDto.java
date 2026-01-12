package org.dansmultipro.ams.amsapp.dto.assignment;

import java.util.List;

public class AddAssignmentRequestDto {
    private String targetEmployeeId;
    private String targetLocationId;
    private String targetAssetId;
    private List<String> assetsId;

    public String getTargetEmployeeId() {
        return targetEmployeeId;
    }

    public void setTargetEmployeeId(String targetEmployeeId) {
        this.targetEmployeeId = targetEmployeeId;
    }

    public String getTargetLocationId() {
        return targetLocationId;
    }

    public void setTargetLocationId(String targetLocationId) {
        this.targetLocationId = targetLocationId;
    }

    public String getTargetAssetId() {
        return targetAssetId;
    }

    public void setTargetAssetId(String targetAssetId) {
        this.targetAssetId = targetAssetId;
    }

    public List<String> getAssetsId() {
        return assetsId;
    }

    public void setAssetsIdLists(List<String> assetsId) { this.assetsId = assetsId; }
}
