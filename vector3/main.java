/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vector3;

/**
 *
 * @author Najwa
 */
public class main {
    public static void main(String[] args) 
    {
        Vector3 vectorX = new Vector3(5, 9, 1);
        Vector3 vectorY = new Vector3(3, 7, 8);
        
        Vector3 hasilX = vectorX.multiply(5);
        System.out.println("Hasil perkalian vektor dengan skalar: [" + hasilX.elements[0] + " " + hasilX.elements[1] + " " + hasilX.elements[2] + "]");
        
        int hasilY = vectorY.multiply(vectorY);
        System.out.println("Hasil perkalian vektor dengan vektor: " + hasilY);
    }
}
