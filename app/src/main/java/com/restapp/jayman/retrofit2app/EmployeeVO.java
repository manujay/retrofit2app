package com.restapp.jayman.retrofit2app;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jayman on 1/11/2017.
 */
public class EmployeeVO extends BaseModel {

    @SerializedName("EmployeeID")
    private String employeeID;
    private String empCode;
    private String eRetailid;
    @SerializedName("F_Name")
    private String fName;
    @SerializedName("L_Name")
    private String lName;
    private String fatherName;
    private String contactNo;
    private String gender;
    private String role;
    private String empSalary;
    private String dOB;
    private String email;
    private String password;
    private String column12;
    private String designation;
    private String reportingMgr;
    private String dOJ;
    private String address;
    private String pincode;
    private String deleted;
    private String createdBy;
    private String createdOn;
    private String modifiedBy;
    private String modifiedOn;
    private String tStatus;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getERetailid() {
        return eRetailid;
    }

    public void setERetailid(String eRetailid) {
        this.eRetailid = eRetailid;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    public String getDOB() {
        return dOB;
    }

    public void setDOB(String dOB) {
        this.dOB = dOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getColumn12() {
        return column12;
    }

    public void setColumn12(String column12) {
        this.column12 = column12;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getReportingMgr() {
        return reportingMgr;
    }

    public void setReportingMgr(String reportingMgr) {
        this.reportingMgr = reportingMgr;
    }

    public String getDOJ() {
        return dOJ;
    }

    public void setDOJ(String dOJ) {
        this.dOJ = dOJ;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getTStatus() {
        return tStatus;
    }

    public void setTStatus(String tStatus) {
        this.tStatus = tStatus;
    }

    @Override
    public String toString() {
        return "EmployeeVO{" +
                "employeeID='" + employeeID + '\'' +
                ", empCode='" + empCode + '\'' +
                ", eRetailid='" + eRetailid + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", gender='" + gender + '\'' +
                ", role='" + role + '\'' +
                ", empSalary='" + empSalary + '\'' +
                ", dOB='" + dOB + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", column12='" + column12 + '\'' +
                ", designation='" + designation + '\'' +
                ", reportingMgr='" + reportingMgr + '\'' +
                ", dOJ='" + dOJ + '\'' +
                ", address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                ", deleted='" + deleted + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn='" + createdOn + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", modifiedOn='" + modifiedOn + '\'' +
                ", tStatus='" + tStatus + '\'' +
                '}';
    }
}
