package PrototypePattern;

import org.w3c.dom.css.Rect;

/**
 * Created by xhon on 16-11-14.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    public void draw(){
        System.out.println("From Rectangle class, draw method");
    }
}
