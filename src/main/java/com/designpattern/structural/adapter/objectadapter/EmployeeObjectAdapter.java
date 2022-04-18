package com.designpattern.structural.adapter.objectadapter;

import com.designpattern.structural.adapter.Customer;
import com.designpattern.structural.adapter.Employee;

public class EmployeeObjectAdapter implements Customer {
    private Employee employee;

    public EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getFirstName() + " "+ employee.getLastName();
    }

    @Override
    public String getAddress() {
        return employee.getEmpAddress();
    }

    @Override
    public String getDesignation() {
        return employee.getPosition();
    }
}
