package com.myproject.designpatterns.behavioral.memento;

public class FileWriterCareTaker {
    private Object object;

    public void save(FileWriterUtil fileWriterUtil){
       this.object = fileWriterUtil.save();
    }

    public void undo(FileWriterUtil fileWriterUtil){
       fileWriterUtil.undoToLastSave(object);
    }
}
