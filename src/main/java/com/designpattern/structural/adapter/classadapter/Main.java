package com.designpattern.structural.adapter.classadapter;

import com.designpattern.structural.adapter.BusinessCard;
import com.designpattern.structural.adapter.Employee;
import com.designpattern.structural.adapter.objectadapter.EmployeeObjectAdapter;

public class Main {
    public static void main(String[] args) {
        //--------- Class adapter
        BusinessCard card = new BusinessCard();

        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployee(adapter);
        card.printCard(adapter);

        //-------- ObjectAdapter
        BusinessCard card2 = new BusinessCard();
        Employee employee = new Employee();
        populateEmployee(employee);
        EmployeeObjectAdapter adapter2 = new EmployeeObjectAdapter(employee);
        card2.printCard(adapter2);
    }

    static void populateEmployee(Employee employee){
        employee.setFirstName("Pranav");
        employee.setLastName("Jamadagni");
        employee.setPosition("Associate");
        employee.setEmpAddress("Some address, some-city, 111111");
    }
}
