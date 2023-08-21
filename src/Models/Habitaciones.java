
package Models;

import Controller.Administración;
import Controller.EnumTipo;
import Controller.EnumEstado;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Habitaciones implements Administración<Habitaciones>{
    private int numeroHabitacion;
    private EnumTipo tipo;
    private EnumEstado estado;
    private double precio;

    public Habitaciones(int numeroHabitacion, EnumTipo tipo, EnumEstado estado) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public EnumTipo getTipo() {
        return tipo;
    }

    public EnumEstado getEstado() {
        return estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setEstado(EnumEstado estado) {
        this.estado = estado;
    }

    @Override
    public boolean isComplete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Habitaciones Buscar(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Eliminar(Habitaciones obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Agregar(Habitaciones obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
