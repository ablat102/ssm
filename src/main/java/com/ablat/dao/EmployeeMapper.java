package com.ablat.dao;

import com.ablat.bean.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;


public interface EmployeeMapper {
    /**
     * 插入员工
     *  员工
     * @return 查到的行数
     */
    public int insert();

    /**
     * 查询所有员工
     *
     * @return 员工集合
     */
    public List<Employee> queryAllEmployees();
}