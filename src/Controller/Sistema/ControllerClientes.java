
package Controller.Sistema;

import Controller.Administración;
import Models.Clientes;
import Views.View;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class ControllerClientes implements Administración<Clientes>{
    
    public ArrayList<Clientes> arrayClientes;
    private Clientes cliente;
    private View view;
    
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
    public void readAll() {
        Clientes[] members=this.toArray();
        if (members.length>0){
            this.view.displayAll(members);
        }
    }
    public Clientes[] toArray() {
        return this.arrayClientes.toArray(new Clientes[0]);
    }
}
