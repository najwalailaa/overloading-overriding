/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Najwa
 */
class Student extends Person {
    String studentId;
    
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    
    public void display() {
        super.display();
        System.out.println("NPM: " + studentId);
    }
    
    public void study() {
        System.out.println(name + " sedang belajar");
    }
    
    public void study(int hours) {
        System.out.println(name + " sedang belajar selama " + hours + " jam");
    }
}
