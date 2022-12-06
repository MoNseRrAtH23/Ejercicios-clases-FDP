/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD3;

import java.util.Scanner;
/**
 *
 * @author Moserrath
 */
public class EXAMENPT2 {
     public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        byte numero, i=1;
        System.out.println("Ingrese un numero:");
        numero=entrada.nextByte(); 
        System.out.println("Que hace este programa?\n");
        while(i<=11){
            System.out.println(i+"X"+numero+"="+(i*numero));
            i++; 
        }
    }
    
}
