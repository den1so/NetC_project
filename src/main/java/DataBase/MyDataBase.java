package DataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;


public class MyDataBase {
    private static final String URL =  "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME   =  "den";
    private static final String PASSWORD   =  "9621";
    Connection connection;

    public MyDataBase() throws ClassNotFoundException, SQLException {

    }
    public void writeName(String name1) throws ClassNotFoundException, SQLException {

        try {
            Driver driver = new org.postgresql.Driver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if(!connection.isClosed()){
                System.out.println("Соединение с БД установлено!");
            }

            Statement statement = connection.createStatement();
            String insrtSQL = "INSERT INTO names_db  VALUES ('" + name1 +"', '"+ new java.util.Date() +"');";
            System.out.println(insrtSQL);
            statement.executeUpdate(insrtSQL);
            connection.close();
        } catch (SQLException e) {
            System.out.println("Неудалось загрузить драйвер класса");
        }
    }


}
