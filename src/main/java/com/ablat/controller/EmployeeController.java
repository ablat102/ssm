package com.ablat.controller;

import com.ablat.bean.Employee;
import com.ablat.service.IEmployeeService;
import com.ablat.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller(value = "employeeController")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeServiceImpl;
    @RequestMapping(value = "/emps")
    public String emps(){
        List<Employee> emps = employeeServiceImpl.getAll();
        System.out.println(emps.size());
        return "employee";
    }

    @RequestMapping("/insert")
    public String insert(){
        int i = employeeServiceImpl.insertEmployee();
        System.err.println(i);
        return "employee";
    }
}
