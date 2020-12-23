package com.example.demo.DataSourceText;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

public class datasource {
    @Autowired
    private DataSource dataSource;

    public String text(){
        return dataSource.toString();
    }

}
