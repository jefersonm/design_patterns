package com.jefersonmachado.design_patterns.creational.abstract_factory.color;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
