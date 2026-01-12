package org.dansmultipro.ams.amsapp.dto.employees;

public class EmployeesRequestDto {
    private String fullName;
    private String companyId;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
