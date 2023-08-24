
package Controller.Sistema;

import Models.Reserva;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class ControllerReserva {
    
    private ArrayList<Reserva> reservas;

    public ControllerReserva() {
        this.reservas = new ArrayList<>();
    }
    
    public Reserva Buscar(int numero) {
        for (Reserva reserva : reservas){
            if (reserva.getNumeroReserva()==numero){
                return reserva;
            }
        }
        return null;
    }
    
    public void activar(Reserva obj){
        obj.activar();
    }
    
    public void finalizar(Reserva obj){
        obj.finalizar();
    }
    
    public void cancelar(Reserva obj){
        obj.cancelar();
    }
    
}
