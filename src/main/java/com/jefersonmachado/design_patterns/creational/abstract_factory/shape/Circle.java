package com.jefersonmachado.design_patterns.creational.abstract_factory.shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
