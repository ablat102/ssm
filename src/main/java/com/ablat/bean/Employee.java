package com.ablat.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "employee")
public class Employee {
    //员工id
    private String employeeId;
    //员工姓名
    private String employeeName;
    //员工性别
    private String employeeGender;
    //员工邮箱
    private String employeeEmail;
    //部门编号
    @Autowired
    private Department departmentId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }
}