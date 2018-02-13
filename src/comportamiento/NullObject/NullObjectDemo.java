package comportamiento.NullObject;

/**
 * Created by leandro on 7/2/17.
 */
public class NullObjectDemo {
    /*
    Encapsula la ausencia de un objeto mediante otro objeto que provee un comportamiento “do nothing”(no hacer nada)
    por omisión.

    Ventajas
    ● Evitar excepciones Null Pointer
    ● Minimiza el uso de condicionales
     */

    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
