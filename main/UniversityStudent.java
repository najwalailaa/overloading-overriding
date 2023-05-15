/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Najwa
 */
class UniversityStudent extends Student {
    String major;
    
    public UniversityStudent(String name, int age, String studentId, String major) {
        super(name, age, studentId);
        this.major = major;
    }
    
    public void display() {
        super.display();
        System.out.println("Jurusan: " + major);
    }
    
    public void study() {
        System.out.println(name + " sedang belajar di universitas");
    }
    
    public void study(String subject) {
        System.out.println(name + " sedang belajar mata kuliah " + subject);
    }
}
