package FactoryPattern;

/**
 * Created by xhon on 16-11-10.
 */
public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("rectangle");

        Shape shape2 = shapeFactory.getShape("square");

        shape1.draw();
        shape2.draw();
    }
}
