/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

/**
 *
 * @author Moserrath
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        String[]pokemones={"treecko","totodile","torchie","trokoal","psyduck","wobbufet","cyndaquil"};
        for (int i = 0; i < pokemones.length; i++) {
            System.out.println((i+1)+"."+pokemones[i]);
            
        }
        int i=1;
        for (String pokemon : pokemones) {
            System.out.println((i+1)+"."+pokemon);
            i++;
            
        }
    }    
}