package com.lican.DesignPatterns.FactoryMethods;

public class TeacherWorkFactory implements IWorkFactory {
    public Work getWork() {
        return new TeacherWork();
    }
}
