package com.how2java.service;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

@Component("s1")
public class TestJDBCService {
    public void doSomeJDBCService(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
            Statement s = c.createStatement();){
            long start = System.currentTimeMillis();
            int i = 100;
            for(int j = 0;j<i;j++) {
                String sql = "insert into hero values(null," + "'小法师'" + "," + 313.0f + "," + 50 + ")";
                s.execute(sql);
            }
            long end = System.currentTimeMillis();
            System.out.printf("插入100条数据完成于%d",(end-start));
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
