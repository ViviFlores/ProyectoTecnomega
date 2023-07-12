
package com.desarrollo.modelo;

import java.sql.*;  //importar todo lo que ocntiene el paquete

public class Conexion {
    
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/empresa_relsb?useSSL=false&serverTimezone=UTC";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="admin";
    
    //método para obtener le objeto de conexión
    public static Connection getConnection() throws SQLException{ //extender la exception
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    
    //método que cierra los objetos de conexión
    //sobrecarga de métodos
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(PreparedStatement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void close(Connection conn ) throws SQLException{
        conn.close();
    }
    
    
}
