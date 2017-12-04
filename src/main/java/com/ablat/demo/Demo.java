package com.ablat.demo;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;

public class Demo {

    public static void main(String[] args) throws Exception {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/ployproducts");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("102404");
        System.out.println(driverManagerDataSource);
        Connection conn = driverManagerDataSource.getConnection();
        System.err.println(conn);
    }
}
