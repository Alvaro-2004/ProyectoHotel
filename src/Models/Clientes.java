package Models;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Clientes {
    private String cedula;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String correo;
    private int edad;
    private boolean reserva;
    private ArrayList<Clientes> array;

    public Clientes(String cedula, String nombre, LocalDate fechaNacimiento, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.edad();
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

    public boolean isReserva() {
        return reserva;
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
    
    
}
