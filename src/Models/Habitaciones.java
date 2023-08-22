
package Models;

import Controller.Administración;
import Controller.EnumTipo;
import java.util.ArrayList;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Habitaciones implements Administración<Habitaciones>{
    private int numeroHabitacion;
    private EnumTipo tipo;
    private boolean estado;
    private double precio;
    private ArrayList<Habitaciones> array;

    public Habitaciones(int numeroHabitacion, EnumTipo tipo) {
        array = new ArrayList<>();
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.estado = false;
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
    
    
    public void salario() {
        switch (this.tipo) {
            case Individual ->
                this.precio = 45000;
            case Doble ->
                this.precio = 80000;
            case Suite ->
                this.precio = 140000;
        }
    }
    @Override
    public boolean isComplete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean Actualizar(Habitaciones obj, EnumTipo tipo){
        for (Habitaciones habitacion : array){
            if (habitacion.equals(obj)){
                habitacion.setTipo(tipo);
                return true;
            }
        }
        return false;
    }
    @Override
    public Habitaciones Buscar(String texto) {
        for (Habitaciones habitacion : array){
            if (Integer.toString(habitacion.getNumeroHabitacion()).equals(texto)){
                return habitacion;
            }
        }
        return null;
    }

    @Override
    public boolean Eliminar(Habitaciones obj) {
        for (Habitaciones habitacion : array){
            if (habitacion.equals(obj)){
                return array.remove(obj);
            }
        }
        return false;
    }

    @Override
    public boolean Agregar(Habitaciones obj) {
        for (Habitaciones habitacion : array){
            if (!habitacion.equals(obj)){
                return array.add(obj);
            }
        }
        return false;
    }
    
    
    
}
