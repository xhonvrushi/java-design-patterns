package BridgePattern;

/**
 * Created by xhon on 16-11-16.
 */
public abstract class Shape {
    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
