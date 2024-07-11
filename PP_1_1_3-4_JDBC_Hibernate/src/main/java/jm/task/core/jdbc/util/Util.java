package jm.task.core.jdbc.util;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Util {
    // реализуйте настройку соеденения с БД

    static Connection connection;

    private static final String URL = "jdbc:mysql://localhost:3306/mybdtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final Logger LOGGER = Logger.getLogger(Util.class.getName());

    public static Connection getConnection() {
        try {

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Соединение с БД установлено");
            }
        } catch (SQLException e) {
            System.out.println("Соединение с БД не установлено");
            e.printStackTrace();
        }
        return connection;
    }

}
