/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author Monserrath
 */
public class ejercico13 {
    public static void main(String[] ars){
        Scanner sc=new Scanner(System.in); 
        double salario; 
        System.out.println("ingrese la cantidad de salario:");
        salario=sc.nextDouble();
        salario=salario*1.25;
        System.out.println("Su salario con 25% de incremento es $: "+salario);
        
    }
}
