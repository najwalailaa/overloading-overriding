/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Najwa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Person person = new Person("Du Sukarno", 25);
        person.display();
        System.out.println();
        
        Student student = new Student("Faiz", 20, "32345");
        student.display();
        student.study();
        student.study(3);
        System.out.println();
        
        UniversityStudent universityStudent = new UniversityStudent("Arona", 22, "21081010111", "Computer Science");
        universityStudent.display();
        universityStudent.study();
        universityStudent.study("Algorithms");
    }
    
}
