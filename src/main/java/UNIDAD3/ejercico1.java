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
public class ejercico1 {
    public static void main(String[] args) {
        int noviasBadBunny,noviasTiti;
        Scanner sc= new Scanner(System.in);
        System.out.println("Titi me pregunto si tengo mucha novias");
        System.out.println("Titi:-BandB¿cuantas novias tienes?");
         noviasBadBunny= sc.nextInt();
        System.out.println("BadB:-Y tu Titi¿cuantas novias tienes?");
        noviasTiti= sc.nextInt();
        
        
       if(noviasBadBunny==noviasTiti)
          System.out.println("BAdBunny tienes las mismas novias de Titi");
        
        if(noviasBadBunny>noviasTiti)
            //VERDADERO
            System.out.println("Bad Bunny tiene mas novias que Titi");
        else //Falso
            
         if(noviasBadBunny<noviasTiti)   
            System.out.println("Titi tiene mas novias que Bad Bunny");
        
            
    }
}
