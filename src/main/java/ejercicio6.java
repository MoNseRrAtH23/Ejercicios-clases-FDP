/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner; 
/**
 *
 * @author Monserrath
 */
public class ejercicio6 {
    public static void main(String[] ars){
        Scanner lector =new Scanner (System.in);
        double kilos,libras; 
        System.out.println("ingrese el valor en kilos:");
        kilos=lector.nextDouble(); 
        libras =kilos/0.454; 
        System.out.println("El resulatdo es:" +libras);    
    }
}
