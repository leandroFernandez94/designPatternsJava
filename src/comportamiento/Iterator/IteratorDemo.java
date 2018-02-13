package comportamiento.Iterator;

/**
 * Created by leandro on 7/1/17.
 */
public class IteratorDemo {
    /*
        Propósito​: Proveer una forma de acceder a los elementos de una colección de objetos en
        orden secuencial, sin exponer la implementación real de la colección.
     */

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
