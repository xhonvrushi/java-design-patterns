package PrototypePattern;

import java.util.Hashtable;
/**
 * Created by xhon on 16-11-15.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String id){
        Shape cached = shapeMap.get(id);
        return (Shape) cached.clone();
    }

    public static void loadCache(){
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
    }
}
