package Models;

import Controller.EnumEstado;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Reserva {
    private static int numeroReserva = 0;
    private Clientes cliente;
    private String cedulaCliente;
    private Habitaciones habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private EnumEstado estado;
    private LocalDate tiempoReservado;
    private double montoTotal;
    private ArrayList<Reserva> reservas;

    public Reserva(String cedulaCliente, Habitaciones habitacion, LocalDate fechaEntrada, LocalDate fechaSalida, EnumEstado estado) {
        reservas = new ArrayList<>();
        Reserva.numeroReserva++;
        this.cedulaCliente = cedulaCliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
    }

    public Reserva(String cedulaCliente, Habitaciones habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        reservas = new ArrayList<>();
        this.cedulaCliente = cedulaCliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado=EnumEstado.Pendiente;
    }

    public static int getNumeroReserva() {
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

    public LocalDate getTiempoReservado() {
        return tiempoReservado;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setEstado(EnumEstado estado) {
        this.estado = estado;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    public Clientes registrado(){
        return cliente.Buscar(cedulaCliente);
        //Si retorna null se debe agregar el cliente
    }
    
    
}
