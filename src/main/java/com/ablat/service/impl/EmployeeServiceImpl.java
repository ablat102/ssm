package com.ablat.service.impl;


import com.ablat.bean.Employee;
import com.ablat.dao.EmployeeMapper;
import com.ablat.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "employeeServiceImpl")
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    public List<Employee> getAll(){
        return employeeMapper.queryAllEmployees();
    }

    @Override
    public int insertEmployee() {
        return employeeMapper.insert();
    }
}
