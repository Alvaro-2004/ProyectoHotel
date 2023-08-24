package Models;

import Controller.EnumEstado;
import Controller.EnumTipo;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Reserva {
    private static int numero = 0;
    private int numeroReserva;
    private Clientes cliente;
    private String cedulaCliente;
    private Habitaciones habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private EnumEstado estado;
    private int tiempoReservado;
    private double subTotal;
    private double impuesto;
    private double montoTotal;

    public Reserva(String cedulaCliente, Habitaciones habitacion, LocalDate fechaEntrada, LocalDate fechaSalida, EnumEstado estado) {
        this.numeroReserva= numero++;
        this.cedulaCliente = cedulaCliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.tiempo();
        this.totalCostos();
    }

    public Reserva(String cedulaCliente, Habitaciones habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.numeroReserva= numero++;
        this.cedulaCliente = cedulaCliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado=EnumEstado.Pendiente;
        this.tiempo();
        this.totalCostos();
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public Habitaciones getHabitacion() {
        return habitacion;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public EnumEstado getEstado() {
        return estado;
    }

    public long getTiempoReservado() {
        return tiempoReservado;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setEstado(EnumEstado estado) {
        this.estado = estado;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    public void tiempo() {
        this.tiempoReservado = ((int) ChronoUnit.DAYS.between(fechaEntrada, fechaSalida))-1; 
    }
    
    public void totalCostos(){
        this.montoTotal=habitacion.getPrecio()*this.tiempoReservado;
        this.impuesto=this.montoTotal-(this.montoTotal/(1+0.13));
        this.subTotal=this.montoTotal-this.impuesto;
    }
    
    public boolean activar(){
        if (this.estado==EnumEstado.Pendiente){
            this.estado=EnumEstado.Ejecucion;
            habitacion.setEstado(false);
            return true;
        }
        return false;
    }
    public boolean finalizar(){
        if (this.estado==EnumEstado.Ejecucion){
            this.estado=EnumEstado.Finalizada;
            habitacion.setEstado(true);
            return true;
        }
        return false;
    }
    public boolean cancelar(){
        if (this.estado==EnumEstado.Pendiente){
            this.estado=EnumEstado.Cancelada;
            return true;
        }
        return false;
    }
    
}
