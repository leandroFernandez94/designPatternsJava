package estructurales.Flyweight;

/**
 * Created by leandro on 7/2/17.
 */
public class FlyweightDemo {
    /*
        Emplear objetos compartidos que son similares, en lugar de crear nuevas
        instancias. Se usa cuando se necesita crear muchos objetos similares. Mejora la
        performance, ya que reduce el uso de memoria.
     */

    public static final int ROWS = 6, COLS = 10;

    public static void main(String[] args) {
        Factory theFactory = new Factory(ROWS);
        for (int i=0; i < ROWS; i++) {
            for (int j=0; j < COLS; j++)
                theFactory.getFlyweight(i).report(j);
            System.out.println();
        }
    }
}
