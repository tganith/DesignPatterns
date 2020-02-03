package com.myproject.designpatterns.practice;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
    private List<String> list ;

    public Employee(){
        list = new ArrayList<>();
    }

    public Employee(List<String> newList){
        list = newList;
    }

    public void loadData(){
        list.add("ganitha");
        list.add("jayansh");
    }

    public Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<>();
        for(String newList :list){
            tempList.add(newList);
        }
        return new Employee(tempList);
    }

    public List<String> getEmpList() {
        return list;
    }

}
