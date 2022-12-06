/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author Monserrath
 */
public class ejercicio16 {
    public static void main(String[] ars){
        Scanner sc= new Scanner(System.in);
        int dias,horas,min,dias_segundos,horas_segundos,min_segundos,total; 
        System.out.println("ingrese numero de dias:");
        dias=sc.nextInt();
                
        System.out.println("ingrese numero de Horas:");
        horas=sc.nextInt();
        
        System.out.println("ingrese numero de Minutos:");
        min = sc.nextInt();
        
        dias_segundos=dias*24*60*60; //dias*86400
        horas_segundos=horas*60*60; //horas*3600
        min_segundos=min*60;
        
        total=dias_segundos+horas_segundos+min_segundos; 
        System.out.println("Su equivalencia en segundos es:"+total);
        
        
    }
}
