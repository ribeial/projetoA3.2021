package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author victo
 */
public class ConexaoDAO {

    Connection conn;

    public Connection conectaBD() {
        try {
            String url = "jdbc:mysql://localhost:3306/projetoa3?user=root&password=";
            conn = DriverManager.getConnection(url);
        }
        catch (SQLException ex) {
            System.out.println(" Deu ruim na conexão " + ex);
        }
        return conn;
    }
}
