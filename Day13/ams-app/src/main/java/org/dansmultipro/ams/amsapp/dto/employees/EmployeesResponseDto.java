package org.dansmultipro.ams.amsapp.dto.employees;

public class EmployeesResponseDto {
    private String id;
    private String fullName;
    private String companyName;

    public EmployeesResponseDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
