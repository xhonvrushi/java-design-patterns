package PrototypePattern;

/**
 * Created by xhon on 16-11-14.
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    public void draw(){
        System.out.println("From Square class, draw method");
    }
}
