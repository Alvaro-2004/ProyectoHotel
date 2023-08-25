
package Controller.Sistema;

import Models.Clientes;
import Models.Reserva;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class ControllerReserva {
    private Clientes cliente;
    private ControllerClientes controller;
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
    public String buscarCliente(String ced){
        for (Clientes cliente:controller.arrayClientes){
            if(ced.equals(cliente)){
                return cliente.getNombre();
            }
        }
        return "No registrado";
    }
    
}
