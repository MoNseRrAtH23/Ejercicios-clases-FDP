/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author Monserrath
 */
public class ejercicio15 {
    public static void main(String[] ars){
        int x,y,aux; //aux es una variable que funciona com axuliar 
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese el valor de x:");
        x=sc.nextInt();
        System.out.println("ingrese valor de y:");
        y=sc.nextInt();
        
        aux=x;
        x=y;
        y=aux;
                
                
        System.out.println("El valor de x es:"+x);
        System.out.println("El valor de y es:"+y); 
        
    }
}
