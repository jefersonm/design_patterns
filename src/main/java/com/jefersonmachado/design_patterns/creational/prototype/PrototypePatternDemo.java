package com.jefersonmachado.design_patterns.creational.prototype;

import java.util.List;

public class PrototypePatternDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee dev = new Employee();
        dev.readEmployeeFromDatabase();

        Employee ops = dev.clone();
        Employee business = dev.clone();

        List<String> opsEmployees = ops.getEmployees();
        opsEmployees.add("John");

        List<String> businessEmployees = business.getEmployees();
        businessEmployees.remove("Pankaj");

        System.out.println("Dev employees: "+dev.getEmployees());
        System.out.println("Ops employees: "+opsEmployees);
        System.out.println("Business employees: "+businessEmployees);
    }

}
