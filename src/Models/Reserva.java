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
    private Clientes cedulaCliente;
    private Habitaciones habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private EnumEstado estado;
    private LocalDate tiempoReservado;
    private double montoTotal;
    private ArrayList<Reserva> reservas;

    public Reserva(Clientes cedulaCliente, Habitaciones habitacion, LocalDate fechaEntrada, LocalDate fechaSalida, EnumEstado estado) {
        reservas = new ArrayList<>();
        Reserva.numeroReserva++;
        this.cedulaCliente = cedulaCliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
    }

    public Reserva(Clientes cedulaCliente, Habitaciones habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        reservas = new ArrayList<>();
        this.cedulaCliente = cedulaCliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado=EnumEstado.Pendiente;
    }
    
    
}
