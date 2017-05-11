package com.jefersonmachado.design_patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{

    private List<String> employees;

    public Employee(){
        employees = new ArrayList<>();
    }

    public Employee(List<String> list){
        this.employees = list;
    }
    public void readEmployeeFromDatabase(){
        employees.add("Pankaj");
        employees.add("Raj");
        employees.add("David");
        employees.add("Lisa");
    }

    public List<String> getEmployees() {
        return employees;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException{
        List<String> employees = new ArrayList<>();
        employees.addAll(this.getEmployees());
        return new Employee(employees);
    }

}
