package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection Conectar() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/academia_db", "root", "");
    }
}
