package Models;

/**
 *
 * @author Álvaro Álvarez R
 */
public interface Administración<Type> {

    public Type Buscar();

    public boolean Actualiazr(Type obj);

    public boolean Eliminar(Type obj);

    public boolean Agregar(Type obj);
}
