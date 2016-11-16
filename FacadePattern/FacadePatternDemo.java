package FacadePattern;

/**
 * Created by xhon on 16-11-16.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
