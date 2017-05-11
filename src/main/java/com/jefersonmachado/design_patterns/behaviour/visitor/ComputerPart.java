package com.jefersonmachado.design_patterns.behaviour.visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}