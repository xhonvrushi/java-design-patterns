package BridgePattern;

import PrototypePattern.*;

/**
 * Created by xhon on 16-11-16.
 */
public class BridgePatternDemo {
    public static void main(String[] args){
        Shape redCircle = new Circle(19, 19, 19, new RedCircle());
        Shape greenCircle = new Circle(18, 18, 18, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
