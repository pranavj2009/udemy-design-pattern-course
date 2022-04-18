package com.designpattern.structural.adapter.classadapter;

import com.designpattern.structural.adapter.Customer;
import com.designpattern.structural.adapter.Employee;

public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getAddress() {
        return super.getEmpAddress();
    }

    @Override
    public String getName() {
        return super.getFirstName()+" "+super.getLastName();
    }

    @Override
    public String getDesignation() {
        return super.getPosition();
    }
}
