package com.jefersonmachado.design_patterns.creational.abstract_factory.color;


import com.jefersonmachado.design_patterns.creational.abstract_factory.AbstractFactory;
import com.jefersonmachado.design_patterns.creational.abstract_factory.shape.Shape;

public class ColorFactory extends AbstractFactory {

    public Color getColor(String colorType) {
        switch (colorType) {
            case "RED": return new Red();
            case "GREEN": return new Green();
            case "BLUE": return new Blue();
            default: throw new RuntimeException("You must inform a valid Color");
        }
    }

    @Override
    public Shape getShape(String shape) {
        throw new RuntimeException("This method isn't supported by ColorFactory");
    }

}
