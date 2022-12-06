/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner; 
/**
 *
 * @author Monserrath
 */
public class ejercicio5 {
    public static void main(String[] ars){
        Scanner lector = new Scanner (System.in); 
        double libras,kilos; 
        System.out.println("Ingrese el valor en  libras:");
        libras=lector.nextDouble();
        kilos=libras*0.454;
        System.out.println("El resultado es:" +kilos);
    }
}
