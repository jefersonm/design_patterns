package com.jefersonmachado.design_patterns.creational.abstract_factory.shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
