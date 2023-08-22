package Models;

import Controller.Administración;
import java.util.HashSet;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Servicios implements Administración<Servicios> {
    private int codigoServicio;
    private String nombreServicio;
    private String descripcion;
    private double precio;
    private HashSet<Servicios> hashset;

    public Servicios(int codigoServicio, String nombreServicio, String descripcion, double precio) {
        hashset = new HashSet<>();
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
