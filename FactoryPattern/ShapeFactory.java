package FactoryPattern;

/**
 * Created by xhon on 16-11-10.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
