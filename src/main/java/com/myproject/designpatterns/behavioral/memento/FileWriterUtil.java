package com.myproject.designpatterns.behavioral.memento;

public class FileWriterUtil {

    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName= fileName;
        this.content = new StringBuilder();
    }

    public void write(String content){
        this.content.append(content);
    }

    public Memento save(){
        return new Memento(this.fileName,this.content);
    }

    public class Memento{
        private String fileName;
        private StringBuilder content;

        public Memento(String fileName,StringBuilder content){
            this.content=new StringBuilder(content);
            this.fileName=fileName;
        }
    }

    public String toString(){
        return this.content.toString();
    }

    public void undoToLastSave(Object object){
        Memento memento =(Memento)object;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }



}
