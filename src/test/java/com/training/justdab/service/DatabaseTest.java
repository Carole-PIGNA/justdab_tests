package com.training.justdab.service;

import jakarta.annotation.PostConstruct;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/just_dab_db_test";
        String user = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null) {
                System.out.println("Connexion réussie !");
            } else {
                System.out.println("Connexion échouée !");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
