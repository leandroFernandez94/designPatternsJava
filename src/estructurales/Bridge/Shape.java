package estructurales.Bridge;

/**
 * Created by leandro on 7/1/17.
 */

public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
