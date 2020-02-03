package com.myproject.designpatterns.creational.prototype;

public class PrototypeDemo {

    public static void main(String args[]) throws Exception{
       Employee emp = new Employee(100,"Jayansh");
       Employee cloneEmp = (Employee)emp.clone();
       cloneEmp.setEmpId(200);

       System.out.println(emp.getEmpId()+":"+emp.getEmpName());
       System.out.println(cloneEmp.getEmpId()+":"+cloneEmp.getEmpName());

    }
}
