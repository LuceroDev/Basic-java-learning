/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicioanlesmultiples;

/**
 *
 * @author lucyl
 */
public class CondicioanlesMultiples {

    public static void main(String[] args) {
       /*Ejercicio de números: Si no es mayor ni menor
        entonces preguntar(en el código) si  son iguales*/
       
       //Declaro mis variables
       int num1 = 15;
       int num2 = 15;
       
       if (num1 > num2) {
           System.out.println("El num2 es mayor al num1");
       }
       else {
           if(num1 == num2){
           System.out.println("Los numéros son iguales");
           }
           else {
               System.out.println("El num1 es mayor al num 2");
           }
           
       
       }
       
   
    
    }
    
}
