package com.jefersonm.design_patterns.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = factory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = factory.getShape("SQUARE");
        square.draw();
    }

}
