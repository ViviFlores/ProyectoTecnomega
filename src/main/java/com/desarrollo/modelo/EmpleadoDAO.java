
package com.desarrollo.modelo;

public interface EmpleadoDAO {
    
    public abstract boolean select(EmpleadoDTO empleado);
    public abstract int insert(EmpleadoDTO empleado);
    
}
