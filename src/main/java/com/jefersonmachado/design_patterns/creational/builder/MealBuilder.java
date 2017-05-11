package com.jefersonmachado.design_patterns.creational.builder;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        return meal;
    }

    public Meal prepareFullMonsterMeal() {
        Meal vegMeal = prepareVegMeal();
        vegMeal.addItem(new ChickenBurger());
        vegMeal.addItem(new ChickenBurger());
        vegMeal.addItem(new ChickenBurger());
        vegMeal.addItem(new ChickenBurger());
        vegMeal.addItem(new Coke());
        vegMeal.addItem(new Pepsi());
        return vegMeal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
