/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author Monserrath
 */
public class ejercico11 {
    public static void main(String[] ars){
        Scanner sc=new Scanner(System.in); 
        int cantidad,precio,total,cambio,pago; 
        String nombre;
        System.out.println("Buenos dias señorita Beth");
        System.out.println("\ningrese el producto que desea comprar:");
        nombre= sc.next(); 
       System.out.println("ingrese el precio del producto:");
      precio= sc.nextInt();
      System.out.println("ingrse la cantidad del producto:");
      cantidad= sc.nextInt();
      
      total=precio*cantidad;
     System.out.println("el total a pagar por:" +nombre+ ":es:"+total);
      
      System.out.println("\ningrese la cantidad con la que pagara:");
      pago=sc.nextInt();
      
      cambio=pago-total;
      
      System.out.println("Su cambio es:"+cambio+ ":Que tengo buen dia señorita Beth:");
      
    }
   
}