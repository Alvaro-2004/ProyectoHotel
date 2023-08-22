
package Models;

import Controller.Administración;
import Controller.EnumTipo;
import java.util.HashSet;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Habitaciones implements Administración<Habitaciones>{
    private int numeroHabitacion;
    private EnumTipo tipo;
    private boolean estado;
    private double precio;
    private HabitacionesDisponibles disponibles;
    private HashSet<Habitaciones> hashset;

    public Habitaciones(int numeroHabitacion, EnumTipo tipo) {
        disponibles = new HabitacionesDisponibles();
        hashset = new HashSet<>();
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.estado = false;
        this.precioHabitacion();
        this.disponible();
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
    
    public void disponible(){
        switch (this.tipo) {
            case Individual ->
                this.disponibles.agregar1(this);
            case Doble ->
                this.disponibles.agregar2(this);
            case Suite ->
                this.disponibles.agregar3(this);
        }
    }
    @Override
    public boolean isComplete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean Actualizar(Habitaciones obj, EnumTipo tipo){
        for (Habitaciones habitacion : hashset){
            if (habitacion.equals(obj)){
                habitacion.setTipo(tipo);
                return true;
            }
        }
        return false;
    }
    @Override
    public Habitaciones Buscar(String texto) {
        for (Habitaciones habitacion : hashset){
            if (Integer.toString(habitacion.getNumeroHabitacion()).equals(texto)){
                return habitacion;
            }
        }
        return null;
    }

    @Override
    public boolean Eliminar(Habitaciones obj) {
        for (Habitaciones habitacion : hashset){
            if (habitacion.equals(obj)){
                return hashset.remove(obj);
            }
        }
        return false;
    }

    @Override
    public boolean Agregar(Habitaciones obj) {
        for (Habitaciones habitacion : hashset){
            if (!habitacion.equals(obj)){
                return hashset.add(obj);
            }
        }
        return false;
    }
    
    
    
}
