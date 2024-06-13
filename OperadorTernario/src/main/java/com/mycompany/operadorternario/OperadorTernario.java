/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadorternario;

import java.util.Scanner;

/**
 *
 * @author lucyl
 */
public class OperadorTernario {

    public static void main(String[] args) {
        //Definir mis variables
        double promedio;
        String condicionFinal;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el promedio general del alumno en TodoCode");
        promedio = scanner.nextDouble();
        
        condicionFinal = promedio >=6 ? "Aprobado" : "Desaprobado";
        System.out.println("La condición final del alumno es: " + condicionFinal);
 }
}
