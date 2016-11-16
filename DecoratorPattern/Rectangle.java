package DecoratorPattern;

/**
 * Created by xhon on 16-11-16.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}