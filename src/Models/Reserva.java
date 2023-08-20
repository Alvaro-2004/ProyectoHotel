package Models;

import java.time.LocalDate;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Reserva {
    private int numeroReserva;
    private Clientes cedulaCliente;
    private Habitaciones habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private EnumEstado estado;
    private LocalDate tiempoReservado;
    private double montoTotal;
}
