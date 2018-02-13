package estructurales.Adapter;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by leandro on 5/21/17.
 */


public class Adapter {

    /*Adapter: Sirve para integrar codigo nuevo a un sistema sin tener que cambiar cosas del codigo viejo.

	Usos:
	Convierte la interfaz de una clase en otra interfaz que el cliente espera. Adapter permite a las clases trabajar
	juntas, lo que de otra manera no podría hacerlo debido a sus interfaces incompatibles.

	Ejemplos en la API de java:
		paso de Strings a Lists

	Generalmente se representa al adapter como una interface, pero no es un requisito

	*/



    public static void main(String args[]) {

        //Ejemplo de adapter en la clase Arrays en la API de Java

        Integer[] arrayOfInts = new Integer[] { 42, 43, 44 };

        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        System.out.println(arrayOfInts);

        System.out.println(listOfInts);

        /*Ejemplo propio
            Adapter implementa interfaz nueva(PersonaNueva) conocida por el cliente y recibe en el constructor una instancia de la clase vieja(PersonaVieja)
         */

        //Suponemos que en una base esta la tabla Persona con el formato de PersonaVieja, tenemos cargada esta instancia

        PersonaVieja personaVieja = new PersonaVieja();
        personaVieja.setApellido("Fernandez");
        personaVieja.setNombre("Leandro");
        GregorianCalendar g = new GregorianCalendar();
        g.set(2000,01,01);
        Date d = g.getTime();
        personaVieja.setFechaDeNacimiento(d);

        // el cliente quiere la informacion de esa persona pero con el formato nuevo, osea el de PersonaNueva, entonces instanciamos un adapter(ViejaToNuevaAdapter)
        // que nos permita acceder a la informacion de la persona con la interfaz de una persona nueva.

        ViejaToNuevaAdapter personaNueva = new ViejaToNuevaAdapter(personaVieja);

        System.out.println(personaNueva.getNombre());
        System.out.println(personaNueva.getEdad());


    }

}
