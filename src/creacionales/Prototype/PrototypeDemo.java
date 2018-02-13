package creacionales.Prototype;

/**
 * Created by leandro on 7/1/17.
 */
public class PrototypeDemo {

    /*
    Crear nuevas instancias de objetos clonando otros objetos ya existentes.
    Una ventaja es la performance: es más eficiente clonar que crear y setear valores.
    Una desventaja está relacionada a cómo se clona: hay que tener cuidado si la copia que se
    hace es deep o shallow.

    ● Shallow copy: dado un objeto A se crea un objeto B (de la misma clase que A) y se
    copian uno a uno los campos de A a B. Si el tipo de dato es primitivo, se copia el
    valor. Si el tipo de dato corresponde a un objeto, se copia la referencia, resultando
    que A y B apuntarán al mismo objeto en memoria.

    ● Deep copy: a diferencia de shallow copy, si el tipo de dato del campo que se está
    copiando corresponde a un objeto, se hace también una copia del objeto
    referenciado. Como resultado, A y B no apuntan al mismo objeto en memoria.
     */

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
