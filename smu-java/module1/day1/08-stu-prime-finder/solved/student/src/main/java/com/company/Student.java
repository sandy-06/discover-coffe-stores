package com.company;

public class Student {
    private static final int GPA = GPA;
    private String student;

    public void setName(String student) {
        this.student = student;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
    public void sayHello() {
        System.out.println("Hello, I am " + this.student + " my GPA is " + this.GPA);
    }
}

