package Models;

import Controller.EnumPuesto;
import Controller.Administración;
import java.util.ArrayList;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Empleados implements Administración<Empleados> {

    private String cedula;
    private String nombre;
    private String telefono;
    private EnumPuesto puesto;
    private int salario;
    private ArrayList<Empleados> empleados;

    public Empleados(String cedula, String nombre, String telefono, EnumPuesto puesto, double salario) {
        empleados = new ArrayList<>();
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.puesto = puesto;
        this.salario();
    }

    public Empleados(String cedula, String nombre, EnumPuesto puesto, double salario) {
        empleados = new ArrayList<>();
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = "";
        this.puesto = puesto;
        this.salario();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPuesto(EnumPuesto puesto) {
        this.puesto = puesto;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public EnumPuesto getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void salario() {
        switch (this.puesto) {
            case Gerente ->
                this.salario = 1400000;
            case Recepcionista ->
                this.salario = 800000;
            case Conserje ->
                this.salario = 550000;
            case Supervisor ->
                this.salario = 1100000;
            case Mantenimiento ->
                this.salario = 650000;
        }
    }

    @Override
    public boolean isComplete() {
        return !this.telefono.equals("") && !this.nombre.equals("") && !this.puesto.equals("");
    }

    @Override
    public Empleados Buscar(String texto) {
        for (Empleados empleado : empleados) {
            if (empleado.getNombre().equals(texto)) {
                return empleado;
            }
        }
        return null;
    }

    @Override
    public boolean Eliminar(Empleados obj) {
        for (Empleados empleado : empleados) {
            if (empleado.equals(obj)) {
                return empleados.remove(empleado);
            }
        }

        return false;
    }

    @Override
    public boolean Agregar(Empleados obj) {
        for (Empleados empleado : empleados) {
            if (empleado != (obj)) {
                return empleados.add(obj);
            }
        }
        return false;
    }

    public boolean Actualizar(Empleados obj, String nombre, String telefono, EnumPuesto puesto) {
        for (Empleados empleado : empleados) {
            if (empleado.equals(obj)) {
                if (this.isComplete()) {
                    this.setNombre(nombre);
                    this.setTelefono(telefono);
                    this.setPuesto(puesto);
                    return true;
                }
            }
        }
        return false;
    }
}
