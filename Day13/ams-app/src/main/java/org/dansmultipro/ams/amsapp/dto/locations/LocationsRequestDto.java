package org.dansmultipro.ams.amsapp.dto.locations;

public class LocationsRequestDto {
    private String name;
    private String companyId;

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
}
