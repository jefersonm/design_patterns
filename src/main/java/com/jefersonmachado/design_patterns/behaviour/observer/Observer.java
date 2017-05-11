package com.jefersonmachado.design_patterns.behaviour.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}