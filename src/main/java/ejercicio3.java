/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Monserrath
 */
public class ejercicio3 {
    public static void main(String[] ars){
        Scanner sc= new Scanner (System.in);
        int num1,num2,resultado; 
        System.out.println("ingrese el primer numero:");
        num1=sc.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2=sc.nextInt(); 
        resultado=num1-num2;
        System.out.println("el resultado de la resta es:"+resultado);
    }
    
}
