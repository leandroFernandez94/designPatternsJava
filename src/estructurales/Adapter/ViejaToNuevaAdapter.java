package estructurales.Adapter;

import java.util.GregorianCalendar;

/**
 * Created by leandro on 5/21/17.
 */
public class ViejaToNuevaAdapter implements PersonaNuevaInterface {

    private PersonaVieja instanciaDeVieja;

    public ViejaToNuevaAdapter(PersonaVieja instanciaDeVieja) {
        this.instanciaDeVieja = instanciaDeVieja;
    }

    @Override
    public String getNombre() {
        return this.instanciaDeVieja.getNombre() + " " + this.instanciaDeVieja.getApellido();
    }

    @Override
    public void setNombre(String nombreCompleto) {
        String name[] = nombreCompleto.split(" ");
        this.instanciaDeVieja.setNombre(name[0]);
        this.instanciaDeVieja.setApellido(name[1]);
    }

    @Override
    public int getEdad() {
        GregorianCalendar dateActual = new GregorianCalendar();
        GregorianCalendar nacimiento = new GregorianCalendar();
        nacimiento.setTime(this.instanciaDeVieja.getFechaDeNacimiento());
        return dateActual.get(1) - nacimiento.get(1);
    }

    @Override
    public void setEdad(int edad) {
        GregorianCalendar dateActual = new GregorianCalendar();
        int añoActual = dateActual.get(1);
        dateActual.set(1,añoActual - edad);
        this.instanciaDeVieja.setFechaDeNacimiento(dateActual.getTime());
    }
}
