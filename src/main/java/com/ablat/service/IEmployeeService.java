package com.ablat.service;

import com.ablat.bean.Employee;

import java.util.List;

public interface IEmployeeService {

    public List<Employee> getAll();

    public int insertEmployee();
}
