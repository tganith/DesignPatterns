package com.myproject.designpatterns.creational.singleton;

public class SingletonDemo {

    public static void main(String args[]) {

        // singleton for early
       /* SingletonEarly singletonEarly = SingletonEarly.getInstance();
        System.out.println(singletonEarly.hashCode());
        System.out.println(SingletonEarly.getInstance().hashCode());*/

       // singleton for lazy
        /*SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy.hashCode());
        System.out.println(SingletonLazy.getInstance().hashCode());*/


        // singleton for Thread safe
        /*SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe.hashCode());
        System.out.println(singletonThreadSafe.getInstance().hashCode());*/

        // singleton for Thread safe with double lock
      /*  SingletonThreadSafeDouble singletonThreadSafeDouble = SingletonThreadSafeDouble.getInstance();
        System.out.println(singletonThreadSafeDouble.hashCode());
        System.out.println(singletonThreadSafeDouble.getInstance().hashCode());*/

        // singleton for static block
       /* SingletonStaticBlock singletonStaticBlock = SingletonStaticBlock.getInstance();
        System.out.println(singletonStaticBlock.hashCode());
        System.out.println(singletonStaticBlock.getInstance().hashCode());*/

        // singleton for BillPughSingleton
        /*BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        System.out.println(billPughSingleton.hashCode());
        System.out.println(billPughSingleton.getInstance().hashCode());*/


        // singleton for Cloning with solution
        SingletonClone singletonClone = SingletonClone.getInstance();
        System.out.println(singletonClone.hashCode());

        SingletonClone cloneObj = null;
        try {
            cloneObj = (SingletonClone) singletonClone.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(cloneObj.hashCode());

    }
}
