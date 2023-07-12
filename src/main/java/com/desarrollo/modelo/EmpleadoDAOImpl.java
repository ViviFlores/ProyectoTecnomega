package com.desarrollo.modelo;

import java.sql.*;

public class EmpleadoDAOImpl implements EmpleadoDAO {

    private static final String SQL_INSERT = "INSERT INTO EMPLEADOS (nombre, apellido, cedula, direccion, anios_experiencia, usuario, contrasenia) VALUES (?,?,?,?,?,?,SHA1(?))";
    private static final String SQL_SELECT = "SELECT * FROM EMPLEADOS WHERE usuario=? AND contrasenia=?";

    @Override
    public boolean select(EmpleadoDTO empleado) {
        try {
            //1. Crear el objeto de conexión
            Connection conn = Conexion.getConnection();
            //2. Crear le objeto que prepare la query
            PreparedStatement stmt = conn.prepareStatement(SQL_SELECT);
            //Reemplazar el valor de las interrogantes
            stmt.setString(1, empleado.getUsuario());
            stmt.setString(2, empleado.getContrasenia());
            //3. Ejecutar la query
            ResultSet rs = stmt.executeQuery(); //Devolver el registro o los registros consultados
            //Verificación si existe el registro
            if (rs.next()) {  //si existe el registro con el usuario y conttaseña
                return true;
            }
            //4. Cerrar objetos de conexión
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        }
        return false;
    }

    @Override
    public int insert(EmpleadoDTO empleado) {
        int registros = 0;
        try {
            //1. Crear el objeto de conexión
            Connection conn = Conexion.getConnection();
            //2. Crear le objeto que prepare la query
            PreparedStatement stmt = conn.prepareStatement(SQL_INSERT);
            //Reemplazar el valor de las interrogantes
            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getApellido());
            stmt.setString(3, empleado.getCedula());
            stmt.setString(4, empleado.getDireccion());
            stmt.setInt(5, empleado.getAniosExperiencia());
            stmt.setString(6, empleado.getUsuario());
            stmt.setString(7, empleado.getContrasenia());
            //3. Ejecutar la query
            registros = stmt.executeUpdate(); //1 -> si se ejecutó todo bien
            //4. Cerrar objetos de conexión
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return registros;
    }

}
