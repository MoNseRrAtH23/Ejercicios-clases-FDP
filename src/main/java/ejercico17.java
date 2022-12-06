/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author Monserrath
 */
public class ejercico17 {
    public static void main(String[] ars){
        Scanner sc=new Scanner(System.in);
        int num,dias,horas = 0,min;
        System.out.println("Ingrese los segundos");
        num=sc.nextInt();
        
        dias=num/86400;
        System.out.println("Dias= "+dias);
        
        num=num % 86400; //obteber residuo
        System.out.println("Horas= "+horas);
        
        horas=num/3600;
        System.out.println("Horas="+horas);
        
        num=num%3600;
        System.out.println(">>>Valor de num= "+num);
        
        min=num/60;
        System.out.println("Minutos= "+min);
        
        num=num %60;
        System.out.println(">>>Valor de num="+num);
        
        System.out.println(dias+"dia(s)"+horas+"hr(s)"+min+"min(s)"+num+"Seg");
        
     }
}