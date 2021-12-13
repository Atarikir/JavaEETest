package com.example.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class UserServlet {

//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        PrintWriter printWriter = response.getWriter();
//
//        String urlDb = "jdbc:postgresql://192.168.43.24:5432/java_ee_db";
//        String userName = "postgres";
//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Connection connection = DriverManager.getConnection(urlDb, userName, "");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT name from users");
//
//            while(resultSet.next()) {
//                printWriter.println(resultSet.getString("name"));
//                statement.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}
