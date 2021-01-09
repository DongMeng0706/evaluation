package com.evaluation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.*;


public class TestDataSource {
    private String    driver="com.mysql.cj.jdbc.Driver";;
    private String     url="jdbc:mysql://127.0.0.1:3306/tea_design?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC";
    ;
    private String username = "root";
    private String password = "123456";
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;


    public void setDriver(String driver) {
        this.driver = driver;
    }
    public void setUrl(String url) {
        this.url = url;
    }


    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    private Connection getConnection(){
        try{
            Class.forName(driver);
            con=DriverManager.getConnection(url,username,password);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args){
        TestDataSource d=new TestDataSource();
        System.out.println(d.getConnection());
    }



}

