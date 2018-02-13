package estructurales.Bridge;

/**
 * Created by leandro on 7/1/17.
 */
public class BridgeDemo {
    /*
    Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary
     independently. This type of design pattern comes under structural pattern as this pattern decouples
     implementation class and abstract class by providing a bridge structure between them.
     */


    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
