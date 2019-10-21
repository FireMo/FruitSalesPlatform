package com.lican.DesignPatterns.FactoryMethods;

public class Test {
    public static void main(String[] args) {
        IWorkFactory studentWork = new StudentWorkFactory();
        studentWork.getWork().doWork();

        IWorkFactory teacherWork = new TeacherWorkFactory();
        teacherWork.getWork().doWork();
    }
}
