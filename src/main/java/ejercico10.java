/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author Monserrath
 */
public class ejercico10 {
  public static void main(String[] ars){
    //Sistema binario 
      Scanner sc=new Scanner (System.in); 
      int numero;
      System.out.println("\n\ningrese un numero binario"); 
      numero= sc.nextInt(2);
      System.out.println("Su equivalecia en sistema decimal es:"+numero);
      
      System.out.println("\n\ningrese un numero octal");
      numero= sc.nextInt(8);
      System.out.println("Su equivalente en sistema decimal es:"+numero);
      
      System.out.println("\n\ningrese un numero hexadecimal");
      numero=sc.nextInt(16);
      System.out.println("Su equivalente en sistema decimal es:"+numero); 
      
    }  
}
      