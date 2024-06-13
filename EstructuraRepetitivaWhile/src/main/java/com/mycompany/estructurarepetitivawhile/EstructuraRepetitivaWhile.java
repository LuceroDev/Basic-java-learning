/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructurarepetitivawhile;

/**
 *
 * @author lucyl
 */
public class EstructuraRepetitivaWhile {

    public static void main(String[] args) {
        //WHILE
        /*Se ejecuta código mientras cieta condición se cumpla, cuando se deja de cumplir se deja de repetir*/
    
        //Ejercicio:
        /*Mietras mi contador no llega a diez 
        se va a repetir un mensaje en pantalla */
        
        //Declarando variables
        int cont = 0;
        
        while (cont <= 10) {
            System.out.println("Estoy en la vuelta " +  cont);
            cont = cont + 1; //Cada vuelta va a valer uno mas
        }
    }
    
}
