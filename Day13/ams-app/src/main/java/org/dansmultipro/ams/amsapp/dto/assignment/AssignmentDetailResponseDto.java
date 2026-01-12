package org.dansmultipro.ams.amsapp.dto.assignment;

public class AssignmentDetailResponseDto {
    private String id;
    private String assetName;
    private String returnDate;

    public AssignmentDetailResponseDto() {
    }

    public String getAssetName() {
        return assetName;
    }

    public String getReturnDate() {
        return returnDate;
    }
}
