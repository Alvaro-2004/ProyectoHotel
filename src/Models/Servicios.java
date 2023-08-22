package Models;

import Controller.Administración;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Servicios implements Administración<Servicios> {
    private int codigoServicio;
    private String nombreServicio;
    private String descripcion;
    private double precio;
    private HashMap<Integer, Servicios> hashmap;

    public Servicios(int codigoServicio, String nombreServicio, String descripcion, double precio) {

        hashmap = new HashMap<>();

        this.codigoServicio = codigoServicio;
        this.nombreServicio = nombreServicio;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoServicio() {
        return codigoServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public boolean isComplete() {
        return !this.descripcion.equals("") && this.precio <= 0;
    }

    public Servicios Buscar(String texto) {
            for (Servicios servicio : hashmap.values()) {
            if (servicio.getNombreServicio().equals(texto)) {
                return servicio;
            }
        }
        return null;
    }

    @Override
    public boolean Eliminar(Servicios obj) {
        for (Map.Entry<Integer, Servicios> entry : hashmap.entrySet()) {
            if (entry.getValue().equals(obj)) {
                hashmap.remove(entry.getKey());
                return true;
            }
        }

        return false;
    }

    public boolean Agregar(Servicios obj) {
        for(Servicios servicios : this.hashmap.values()){
            if (!servicios.getNombreServicio().equals(obj.getNombreServicio())){
                hashmap.put(obj.getCodigoServicio(), obj);
                return true;
            }
        }
        return false;
    }

}
