
package Models;

import Controller.Administración;
import Controller.EnumTipo;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Habitaciones implements Administración<Habitaciones>{
    private int numeroHabitacion;
    private EnumTipo tipo;
    private boolean estado;
    private double precio;
    private HashMap<Integer,Habitaciones> hashmap;

    public Habitaciones(int numeroHabitacion, EnumTipo tipo) {
        hashmap = new HashMap<>();
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
        for (Habitaciones habitacion : hashmap.values()){
            if (habitacion.equals(obj)){
                habitacion.setTipo(tipo);
                return true;
            }
        }
        return false;
    }
    @Override
    public Habitaciones Buscar(String texto) {
        for (Habitaciones habitacion : hashmap.values()){
            if (Integer.toString(habitacion.getNumeroHabitacion()).equals(texto)){
                return habitacion;
            }
        }
        return null;
    }

    @Override
    public boolean Eliminar(Habitaciones obj) {
        for (Map.Entry<Integer, Habitaciones> entry : hashmap.entrySet()) {
            if (entry.getValue().equals(obj)) {
                hashmap.remove(entry.getKey());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean Agregar(Habitaciones obj) {
        for (Habitaciones habitacion : hashmap.values()){
            if (!habitacion.equals(obj)){
                hashmap.put(obj.getNumeroHabitacion(), obj);
                return true;
            }
        }
        return false;
    }
    
    
    
}
