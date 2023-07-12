package com.desarrollo.controlador;

import com.desarrollo.modelo.*;

public class ControladorEmpleado {

    private EmpleadoDAO datos = new EmpleadoDAOImpl();

    public int insertarEmpleado(String nombre, String apellido, String cedula, String direccion, int aniosExperiencia, String usuario, String contrasenia) {
        int registros;
        //Generar objeto
        EmpleadoDTO empleado = new EmpleadoDTO(nombre, apellido, cedula, direccion, aniosExperiencia, usuario, contrasenia);
        registros = datos.insert(empleado);
        return registros;
    }
}
