package com.jefersonmachado.design_patterns.creational.abstract_factory;

import com.jefersonmachado.design_patterns.creational.abstract_factory.color.ColorFactory;
import com.jefersonmachado.design_patterns.creational.abstract_factory.shape.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {

        switch(choice) {
            case "SHAPE": return new ShapeFactory();
            case "COLOR": return new ColorFactory();
            default: throw new RuntimeException("You must choose a valid choice (Shape or Color)");
        }

    }

}
