/*int
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5;

import java.util.Scanner;

/**
 *
 * @author Moserrath
 */
public class modularidad {
    static int suma (){
        Scanner lector = new Scanner(System.in);
        int n1, n2;
        System.out.println("ingresa el primer numero:");
        n1=lector.nextInt();
        System.out.println("ingresa elsegundo numero:");
        n2=lector.nextInt();
        return n1+n2;
    }
    public static void main(String[] args) {
        int resultado;
        resultado=suma();
        System.out.println("el resultado de la suma es:"+resultado);
    }
}
    