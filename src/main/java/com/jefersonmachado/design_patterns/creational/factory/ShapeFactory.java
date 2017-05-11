package com.jefersonm.design_patterns.factory;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE": return new Circle();
            case "RECTANGLE": return new Rectangle();
            case "SQUARE": return new Square();
            default: throw new RuntimeException("You must inform a valid Shape");
        }
    }

}
