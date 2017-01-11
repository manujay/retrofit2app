package com.restapp.jayman.retrofit2app.Controller;

import com.google.gson.annotations.SerializedName;
import com.restapp.jayman.retrofit2app.EmployeeVO;

import java.util.ArrayList;

/**
 * Created by jayman on 1/11/2017.
 */
public class WSModel {

    @SerializedName("employee")
    private ArrayList<EmployeeVO> employee;
    @SerializedName("employee_count")
    private int employee_count;

    public int getEmployee_count() {
        return employee_count;
    }

    public void setEmployee_count(int employee_count) {
        this.employee_count = employee_count;
    }

    public ArrayList<EmployeeVO> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<EmployeeVO> employee) {
        this.employee = employee;
    }
}
