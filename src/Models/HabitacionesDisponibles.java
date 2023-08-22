package Models;

import Models.Habitaciones;
import java.util.ArrayList;

/**
 *
 * @author Álvaro Álvarez R
 */
public class HabitacionesDisponibles {
    private Habitaciones habitacion;
    private ArrayList<Habitaciones> habitacionIndividual;
    private ArrayList<Habitaciones> habitacionDoble;
    private ArrayList<Habitaciones> habitacionSuite;

    public HabitacionesDisponibles() {
        habitacionIndividual = new ArrayList<>();
        habitacionDoble = new ArrayList<>();
        habitacionSuite = new ArrayList<>();
    }
    
    public boolean agregar1(Habitaciones obj){
        return habitacionIndividual.add(obj);
    }
    public boolean agregar2(Habitaciones obj){
        return habitacionDoble.add(obj);
    }
    public boolean agregar3(Habitaciones obj){
        return habitacionSuite.add(obj);
    }
    public boolean eliminar1(Habitaciones obj){
        return habitacionIndividual.remove(obj);
    }
    public boolean eliminar2(Habitaciones obj){
        return habitacionDoble.remove(obj);
    }
    public boolean eliminar3(Habitaciones obj){
        return habitacionSuite.remove(obj);
    }

    
    
    
}
