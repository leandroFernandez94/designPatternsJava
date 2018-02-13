package estructurales.Adapter;

/**
 * Created by leandro on 5/21/17.
 */
public class PersonaNueva implements PersonaNuevaInterface {
    private String nombre;
    private int edad;

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombreCompleto) {
        this.nombre = nombreCompleto;
    }

    @Override
    public int getEdad() {
        return this.edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
