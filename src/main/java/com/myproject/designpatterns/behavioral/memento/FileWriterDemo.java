package com.myproject.designpatterns.behavioral.memento;

public class FileWriterDemo {

    public static void main(String args[]) {
        FileWriterCareTaker careTaker = new FileWriterCareTaker();

        FileWriterUtil fileWriter = new FileWriterUtil("test.txt");
        fileWriter.write("First Content \n");
        System.out.println(fileWriter+"\n\n");


        careTaker.save(fileWriter);

        fileWriter.write("Second Content \n");
        System.out.println(fileWriter);

        careTaker.undo(fileWriter);
        System.out.println(fileWriter);
    }
}
