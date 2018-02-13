package comportamiento.Template;

/**
 * Created by leandro on 7/2/17.
 */
public class TemplateDemo {
    /*
        Definir el esqueleto de un algoritmo para una operación, delegando algunos pasos
        en las subclases. Las subclases definen la implementación de esos pasos sin cambiar la
        estructura del algoritmo.

        Se puede utilizar con dos enfoques:
            ● Hooks (gancho): son puntos de extensión y pueden sobreescribirse.
            ● Operaciones abstractas: definen al algoritmo y deben sobreescribirse.

        Ventajas
            ● Reutilización de código.
            ● Evita código duplicado
     */

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
