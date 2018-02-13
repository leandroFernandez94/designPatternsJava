package estructurales.Adapter;

import java.util.Date;

/**
 * Created by leandro on 5/21/17.
 */
public interface PersonaViejaInterface {

    public String getNombre();
    public void setNombre(String nombre);
    public String getApellido();
    public void setApellido(String apellido);
    public Date getFechaDeNacimiento();
    public void setFechaDeNacimiento(Date fecha);

}
