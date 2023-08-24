
package Controller.Sistema;

import Controller.Administración;
import Controller.EnumTipo;
import static Controller.EnumTipo.Doble;
import static Controller.EnumTipo.Individual;
import static Controller.EnumTipo.Suite;
import Models.Habitaciones;
import Models.HabitacionesDisponibles;
import java.util.HashSet;

/**
 *
 * @author sebas
 */
public class ControllerHabitaciones implements Administración<Habitaciones> {
    
    private HabitacionesDisponibles disponibles;
    private HashSet<Habitaciones> hashset;

    public ControllerHabitaciones() {
        this.disponibles = new HabitacionesDisponibles();
        this.hashset = new HashSet<>();
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
    
    public boolean Actualizar(Habitaciones obj, EnumTipo tipo){
        for (Habitaciones habitacion : hashset){
            if (habitacion.equals(obj)){
                habitacion.setTipo(tipo);
                return true;
            }
        }
        return false;
    }
    
    public void disponible(){
        this.disponibles.setIndividualClear();
        this.disponibles.setDobleClear();
        this.disponibles.setSuiteClear();
        
        for (Habitaciones habitacion : hashset)
        switch (habitacion.getTipo()) {
            case Individual ->
                this.disponibles.agregar1(habitacion);
            case Doble ->
                this.disponibles.agregar2(habitacion);
            case Suite ->
                this.disponibles.agregar3(habitacion);
        }
    }
}
