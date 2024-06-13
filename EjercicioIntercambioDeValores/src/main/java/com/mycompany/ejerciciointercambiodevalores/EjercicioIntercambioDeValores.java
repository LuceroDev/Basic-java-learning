/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciointercambiodevalores;

/**
 *
 * @author lucyl
 */
public class EjercicioIntercambioDeValores {

    public static void main(String[] args) {
        
        /*
        Realizar un programa que permita el intercambio de valores entre dos variables.
Por ejemplo: Si una variable numero1 vale 35, y una variable numero2 vale 20, realizar las acciones necesarias para que número1 pase a valer 20 y numero2 a valer 35. Una vez realizado el cambio mostrar el resultado por pantalla.
        */
       //Declaro mis variables
       int num1 = 35;
       int num2 = 20;
       int aux;
       
        System.out.println(".....Antes.....");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        
        
        aux = num2;
        
        num2 = num1;
        
        num1 = aux;
       
        System.out.println(".....Después.....");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
