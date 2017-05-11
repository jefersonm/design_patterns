package com.jefersonmachado.design_patterns.creational.abstract_factory;

import com.jefersonmachado.design_patterns.creational.abstract_factory.color.Color;
import com.jefersonmachado.design_patterns.creational.abstract_factory.shape.Shape;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color red = colorFactory.getColor("RED");
        red.fill();

        Color green = colorFactory.getColor("GREEN");
        green.fill();

        Color blue = colorFactory.getColor("BLUE");
        blue.fill();
    }

}
