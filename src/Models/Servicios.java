package Models;

import Controller.Administración;
import java.util.HashSet;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Servicios implements AdministracionClases<Servicios> {
    public static int numServicio = 1;
    private  int codigoServicio;
    private String nombreServicio;
    private String descripcion;
    private double precio;

    public Servicios(String nombreServicio, String descripcion, double precio) {
        this.codigoServicio=numServicio;
        Servicios.numServicio++;
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

}
