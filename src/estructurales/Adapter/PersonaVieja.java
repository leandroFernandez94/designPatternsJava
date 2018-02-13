package estructurales.Adapter;

import java.util.Date;

/**
 * Created by leandro on 5/21/17.
 */
public class PersonaVieja implements PersonaViejaInterface{
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;


    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return this.apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Date getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    @Override
    public void setFechaDeNacimiento(Date fecha) {
        this.fechaDeNacimiento = fecha;
    }
}
