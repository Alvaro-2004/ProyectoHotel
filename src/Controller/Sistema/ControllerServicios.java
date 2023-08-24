
package Controller.Sistema;

import Controller.Administración;
import Models.Servicios;
import java.util.HashSet;

/**
 *
 * @author sebas
 */
public class ControllerServicios implements Administración<Servicios> {
    
    private HashSet<Servicios> hashset;

    public ControllerServicios() {
        this.hashset = new HashSet<>();
    }

    @Override
    public Servicios Buscar(String texto) {
        for (Servicios servicio : hashset) {
            if (servicio.getNombreServicio().equals(texto)) {
                return servicio;
            }
        }
        return null;
    }

    @Override
    public boolean Eliminar(Servicios obj) {
        for (Servicios servicio : hashset) {
            if (servicio.equals(obj)) {
                return hashset.remove(obj);
            }
        }
        return false;
    }

    @Override
    public boolean Agregar(Servicios obj) {
        for (Servicios servicio : hashset) {
            if (!servicio.equals(obj)) {
                return hashset.add(obj);
            }
        }
        return false;
    }
    
}
