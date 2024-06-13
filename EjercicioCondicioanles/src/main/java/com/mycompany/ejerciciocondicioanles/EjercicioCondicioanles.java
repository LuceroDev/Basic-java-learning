/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocondicioanles;

import java.util.Scanner;

/**
 *
 * @author lucyl
 */
public class EjercicioCondicioanles {

    public static void main(String[] args) {
        
        /*
         Un pequeño supermercado desea calcular los sueldos de sus empleados. Los puestos de los mismos pueden tener 3 categorías:
 - 1 Empleado general cobra $15,890 + un bono del 10%
 - 2 Cajero cobra $25,630.89 fijos
 - 3 Supervisor cobra $35,560.20 en bruto al caul se les descuenta un 11% de jubilación.

Se necesita un programa que, dependiendo del tipo de empleado del que se trate, calcule y muestre en pantalla el correspondiente sueldo.
        */
        
        //Declaro mis variables:
        double sueldo = 0; // Para que no nos muestre error de que no lo inicualizamos
        int categoria;
        
        //Crea una variable llamada teclado que me va a permitir ingresar datos
        //Hay que importar la clase Scanner
        System.out.println("Ingrese el tipo de categoría que desea calcular el sueldo");
        Scanner teclado = new Scanner(System.in); //Me permite ingresar datos al sistema
        categoria = teclado.nextInt(); //El proximo entero que se ingrese por teclado se le va asignar a mi variable categoria
    
        if (categoria == 1 ){
        sueldo = 15890 + (15890 * 0.10);
        }
        else{
            if (categoria == 2){
            sueldo = 25630.89;
            }
            else {
                if (categoria == 3){
                sueldo = 35560.20 - (35560 *0.11);
                }
                else {
                    System.out.println("Debe ingresar un número d ecategoria válido");
                }
            }
        
        }
        if (categoria == 1 || categoria == 2 || categoria ==3){ //Para que me muetre este mensaje solo si se agregan esas categorias
        System.out.println("El total del sueldo para la categoria seleccionada " + categoria + "es iguaol a: " + sueldo);
        }
    }// Fin de mi método
}//Fin de mi clase
