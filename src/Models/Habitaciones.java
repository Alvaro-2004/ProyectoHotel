
package Models;

import Controller.Administración;
import Controller.EnumTipo;
import java.util.HashSet;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Habitaciones {
    private int numeroHabitacion;
    private EnumTipo tipo;
    private boolean estado;
    private double precio;

    public Habitaciones(int numeroHabitacion, EnumTipo tipo) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.estado = true;
        this.precioHabitacion();
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public EnumTipo getTipo() {
        return tipo;
    }

    public boolean getEstado() {
        return estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTipo(EnumTipo tipo) {
        this.tipo = tipo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    public void precioHabitacion() {
        switch (this.tipo) {
            case Individual ->
                this.precio = 45000;
            case Doble ->
                this.precio = 80000;
            case Suite ->
                this.precio = 140000;
        }
    }

}