package com.ablat.dao;

import com.ablat.bean.Department;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;

@Controller
public interface DepartmentMapper {

    public int deleteByPrimaryKey(Integer deptId);

    public int insert(Department record);

    public int insertSelective(Department record);

    public Department selectByPrimaryKey(Integer deptId);

    public int updateByPrimaryKeySelective(Department record);

    public int updateByPrimaryKey(Department record);
}