package com.myproject.designpatterns.practice;

import java.util.List;

public class EmployeeDemoProtoType {

    public static void main(String rgs[]) throws Exception{
        Employee empList = new Employee();
        empList.loadData();

        Employee newEpmloyee = (Employee)empList.clone();
        List<String> newList = newEpmloyee.getEmpList();
        newList.add("lohitha");

        System.out.println(empList.getEmpList());
        System.out.println(newList);
    }
}
