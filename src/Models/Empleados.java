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
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.puesto = puesto;
        this.salario();
    }
    public Empleados(String cedula, String nombre, EnumPuesto puesto, double salario) {
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
    public void salario(){
        switch(puesto){
            case Gerente -> this.salario=1400000;
            case Recepcionista -> this.salario=800000;
            case Conserje -> this.salario=550000;
            case Supervisor -> this.salario=1100000;
            case Mantenimiento -> this.salario=650000;
        }
    }
    @Override
    public boolean isComplete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Empleados Buscar(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Eliminar(Empleados obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Agregar(Empleados obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    

}
