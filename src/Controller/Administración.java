package Controller;

/**
 *
 * @author Álvaro Álvarez R
 */
public interface Administración<Type> {


    public Type Buscar(String texto);
    public boolean Eliminar(Type obj);
    public boolean Agregar(Type obj);
}
