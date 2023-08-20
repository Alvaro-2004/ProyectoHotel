package Models;

import java.util.ArrayList;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Empleados implements Administración {

    private String cedula;
    private String nombre;
    private String telefono;
    private EnumPuesto puesto;
    private double salario;
    private ArrayList<Empleados> empleados;

    public Empleados(String cedula, String nombre, String telefono, EnumPuesto puesto, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.puesto = puesto;
        this.salario = salario;
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

    @Override
    public Object Buscar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Actualiazr(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Agregar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
