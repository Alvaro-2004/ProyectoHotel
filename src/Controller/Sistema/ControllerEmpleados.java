
package Controller.Sistema;

import Controller.Administración;
import Controller.EnumPuesto;
import Models.Empleados;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class ControllerEmpleados implements Administración<Empleados> {
    
    private ArrayList<Empleados> arrayEmpleados;

    public ControllerEmpleados() {
        this.arrayEmpleados = new ArrayList<>();
    }

    @Override
    public Empleados Buscar(String texto) {
         for (Empleados empleado : arrayEmpleados) {
            if (empleado.getNombre().equals(texto)) {
                return empleado;
            }
        }
        return null;
    }

    @Override
    public boolean Eliminar(Empleados obj) {
        for (Empleados empleado : arrayEmpleados) {
            if (empleado.equals(obj)) {
                return arrayEmpleados.remove(empleado);
            }
        }

        return false;
    }

    @Override
    public boolean Agregar(Empleados obj) {
        for (Empleados empleado : arrayEmpleados) {
            if (empleado != (obj)) {
                return arrayEmpleados.add(obj);
            }
        }
        return false;
    }
    
    public boolean Actualizar(Empleados obj,String nombre, String telefono, EnumPuesto puesto){
        for (Empleados empleado : arrayEmpleados) {
            if (empleado.equals(obj)) {
               return empleado.Actualizar(nombre, telefono, puesto);
            }
        }
        return false;
    }
    
}
