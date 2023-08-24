
package Controller.Sistema;

import Controller.Administración;
import Models.Clientes;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class ControllerClientes implements Administración<Clientes>{
    
    private ArrayList<Clientes> arrayClientes;

    public ControllerClientes() {
        this.arrayClientes = new ArrayList<>();
    }

    @Override
    public Clientes Buscar(String texto) {
        for (Clientes cliente : arrayClientes){
            if (cliente.getNombre().equals(texto)){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public boolean Eliminar(Clientes obj) {
        for (Clientes cliente : arrayClientes){
            if (cliente.equals(obj)){
                if(cliente.getReserva()==false){
                return arrayClientes.remove(cliente);}
            }
        }
        return false;
    }

    @Override
    public boolean Agregar(Clientes obj) {
        for (Clientes cliente : arrayClientes){
            if (cliente!=(obj)){
                return arrayClientes.add(obj);
            }
        }
        return false;
    }  
    
}
