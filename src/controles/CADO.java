package controles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CADO {

    public Connection conectar() {
        String URL = "jdbc:mysql://localhost:3306/botica";
        String USUARIO = "root";
        String PASSWORD = "12345678";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    //comandos de agregar, insertar, eliminar, modificar
    public boolean ejecutar(String sql) {
        Statement st;
        try {
            st = this.conectar().createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    //comandos de consultar
    public ResultSet recuperar(String sql) {
        Statement st;
        try {
            st = this.conectar().createStatement(ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE);
            return st.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

}
