package com.desarrollo.modelo;
//Persistencia de datos
public class EmpleadoDTO {  //clase entidad
    
    private int id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private int aniosExperiencia;
    private String usuario;
    private String contrasenia;
    
    //sobrecarga constructores
    //INSERT - EMPLEADOS
    public EmpleadoDTO(String nombre, String apellido, String cedula, String direccion, int aniosExperiencia, String usuario, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.aniosExperiencia = aniosExperiencia;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    
    //SELECT - EMPLEADOS
    public EmpleadoDTO(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
    
    
    
}
