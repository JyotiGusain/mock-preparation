package com.mock.preparation.collection.generics;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Draw Rectangle");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Draw Circle");
    }
}

//Creating a moethod that except the child class of shape
public class WildcardsinGenerics {
    public static void drawShapes(List<? extends Shape> l) {
        for (Shape s : l) {
            s.draw();
        }
    }

    public static void main(String[] args) {
        List<Rectangle> l1 = new ArrayList<Rectangle>();
        l1.add(new Rectangle());

        List<Circle> l2 = new ArrayList<Circle>();
        l2.add(new Circle());


        drawShapes(l1);
        drawShapes(l2);

    }

}
