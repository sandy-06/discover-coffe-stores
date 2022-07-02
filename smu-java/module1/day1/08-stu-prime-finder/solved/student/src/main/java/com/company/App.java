package com.company;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Marta");
        student1.setGPA(3);
        student1.sayHello();

        Student student2 = new Student();
        student2.setName("Justin");
        student2.setGPA(4);
        student2.sayHello();

        System.out.println("Changing person1's name.");
        student1.setName("Cheng-Chien");
        student1.sayHello();
        student2.sayHello();

    }
}
