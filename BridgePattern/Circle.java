package BridgePattern;

import PrototypePattern.*;

/**
 * Created by xhon on 16-11-16.
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int radius, int x, int y, DrawApi drawApi){
        super(drawApi);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public void draw(){
        drawApi.drawCircle(radius, x, y);
    }
}
