/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner; 
/**
 *
 * @author Monserrath
 */
public class ejercico4 {
 public static void main(String[] ars){
   Scanner sc=new Scanner(System.in);
   int nacimiento,actual,edad; 
   System.out.println("ingrese año de nacimiento:");
   nacimiento=sc.nextInt();
   System.out.println("ingrese año acutal:");
   actual=sc.nextInt(); 
   edad=actual-nacimiento;
   System.out.println("Su edad es:"+edad);
   
 }   
}
