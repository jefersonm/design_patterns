package com.jefersonmachado.design_patterns.creational.abstract_factory.shape;

import com.jefersonmachado.design_patterns.creational.abstract_factory.AbstractFactory;
import com.jefersonmachado.design_patterns.creational.abstract_factory.color.Color;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        throw new RuntimeException("This method isn't supported by ShapeFactory");
    }

    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE": return new Circle();
            case "RECTANGLE": return new Rectangle();
            case "SQUARE": return new Square();
            default: throw new RuntimeException("You must pass a valid Shape");
        }
    }

}
