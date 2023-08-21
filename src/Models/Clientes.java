package Models;

import Controller.Administración;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Clientes implements Administración<Clientes>{
    private String cedula;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String correo;
    private int edad;
    private boolean reserva;
    private ArrayList<Clientes> array;

    public Clientes(String cedula, String nombre, LocalDate fechaNacimiento, String correo, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.reserva=false;
        this.edad();
    }
    public Clientes(String cedula, String nombre, String correo, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaNacimiento = null;
        this.correo = correo;
        this.reserva=false;
    }
    public Clientes(String cedula, String nombre, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = "";
        this.fechaNacimiento = null;
        this.correo = correo;
        this.reserva=false;
    }
    public Clientes(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = "";
        this.fechaNacimiento = null;
        this.correo = "";
        this.reserva=false;
    }
    
    public void edad(){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        this.edad = periodo.getYears();
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean getReserva() {
        return reserva;
    }
    
    public void setReserva(boolean bool){
        this.reserva=bool;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    @Override
    public boolean isComplete() {
        return !this.cedula.equals("") && !this.nombre.equals("") &&!this.correo.equals("");
    }
    
    @Override
    public Clientes Buscar(String texto) {
        for (Clientes cliente : array){
            if (cliente.getNombre().equals(texto)){
                return cliente;
            }
        }
        return null;
    }

    public boolean Actualizar(Clientes obj, String nombre, String telefono, String correo) {
        for (Clientes cliente : array){
            if (cliente.equals(obj)){
                if(this.isComplete()){
                    this.setNombre(nombre);
                    this.setTelefono(telefono);
                    this.setCorreo(correo);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean Eliminar(Clientes obj) {
        for (Clientes cliente : array){
            if (cliente.equals(obj)){
                if(this.getReserva()==false){
                return array.remove(cliente);}
            }
        }
        return false;
    }

    @Override
    public boolean Agregar(Clientes obj) {
        for (Clientes cliente : array){
            if (cliente!=(obj)){
                return array.add(obj);
            }
        }
        return false;
    }  
    
}
