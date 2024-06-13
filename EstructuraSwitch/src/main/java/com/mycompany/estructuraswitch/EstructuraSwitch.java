/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructuraswitch;

/**
 *
 * @author lucyl
 */
public class EstructuraSwitch {

    public static void main(String[] args) {
        /*Ejercicio: Días de la semada  */
        
        //Declaro mis variables
        int dia = 8; 
        String nombreDia;
        
        //Tengo que poner cada uno de los casos de la variable día
        switch (dia) {
            case 1: nombreDia = "Lunes";
            break; /*Aqui se pone break, es para que pase porque ya se encontro ese caso*/
            case 2: nombreDia = "Martes";
            break;
            case 3: nombreDia = "Miércoles";
            break;
            case 4: nombreDia = "Jueves";
            break;
            case 5: nombreDia = "Viernes";
            break;
            case 6: nombreDia = "Sábado";
            break;
            case 7: nombreDia = "Domingo";
            break;
            default: nombreDia = "Nombre de día invalido";
            break; /*Al final ponemos una opción si 
            no se agrega un numero incorrecto, por ejemplo 8 o 0 u otro numero de dia que no existe*/
     
        }
        System.out.println("El día de la semana es: " + nombreDia);
    }
}
