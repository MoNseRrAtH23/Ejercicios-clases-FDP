/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author Monserrath
 */
public class ejercicio14 {
    public static void main(String[] ars){
        final double DESCUENTO=0.10; 
        
        Scanner sc=new Scanner(System.in);
        double subtotal,total;
        System.out.println("ingrese el total de la comprar: ");
        subtotal= sc.nextDouble();
        total=subtotal-(subtotal*DESCUENTO);
        
        System.out.println("El total de compra con descuento es:"+total);
        
    }
}
