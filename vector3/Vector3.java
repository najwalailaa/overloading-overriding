/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector3;

/**
 *
 * @author Najwa
 */
public class Vector3 {

    /**
     * @param args the command line arguments
     */

   int[] elements = new int[3];
    
    public Vector3(int x, int y, int z)
    {
        this.elements[0] = x;
        this.elements[1] = y;
        this.elements[2] = z;
    };
    public Vector3 multiply(int skalar) 
    {
        Vector3 result = new Vector3(0, 0 ,0);
        for (int i = 0; i < 3; i++) {
            result.elements[i] = elements[i] * skalar;
        }
        return result;
    }
    
    public int multiply(Vector3 vektor) {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            result = result + elements[i] * vektor.elements[i];
        }
        return result;
    }
    
}
