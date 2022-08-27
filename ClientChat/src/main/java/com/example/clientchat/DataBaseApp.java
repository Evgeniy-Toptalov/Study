package com.example.clientchat;

import java.sql.*;

public class DataBaseApp {

    private static Connection connection;
    private static Statement statement;



    public static void main(String[] args) {

        try {
            connect();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

/////////////////////////////////////////////////////////////////////////////////////////////

// получаю данные из базы но как их внести в чат не могу сообразить, позже буду разбираться
        // чат в апреле писали уже забыл что там к чему
        try {
            ResultSet select = statement.executeQuery("select * from Login_and_pass");
            while (select.next()) {
                System.out.println(select.getString(2) + "\t");
                System.out.println(select.getString(3) + "\t");
                System.out.println(select.getString(4) + "\t");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        /////////////////////////////////////////////////////////////////////////////////////////////

        try {
            disconnect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        //connection = DriverManager.getConnection("jdbc:sqlite:Auth_Information.db");
        connection = DriverManager.getConnection("jdbc:sqlite:D:\\JAVA Programs\\Study\\ClientChat\\Auth_Information.db");
        statement = connection.createStatement();
    }

    public static void disconnect() throws SQLException {
        connection.close();

    }
}
