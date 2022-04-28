/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte_1;

import java.util.Scanner;

/**
 *
 * @author santiago
 */
public class strings {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String apellido1,apellido2;
        System.out.print("Ingrese primer apellido:");
        apellido1=teclado.next();
        System.out.print("Ingrese segundo apellido:");
        apellido2=teclado.next();
        if (apellido1.equals(apellido2)) {//ojoooooooooo con el equals
            System.out.print("Los apellidos son iguales");
        } else {
            System.out.print("Los apellidos son distintos");
        }
        // en caso e mayusculas
        if (apellido1.equalsIgnoreCase(apellido2)) {
            System.out.print("Los apellidos son iguales sin tener en cuenta mayúsculas y minúsculas");
        } else {
            System.out.print("Los apellidos son distintos sin tener en cuenta mayúsculas y minúsculas");
        }
    }
}


/*PROBLEMA 1

String nombre1,nombre2;
int edad1,edad2;
System.out.print("Ingrese el nombre:");
nombre1=teclado.next();
System.out.print("Ingrese edad:");
edad1=teclado.nextInt();
System.out.print("Ingrese el nombre:");
nombre2=teclado.next();
System.out.print("Ingrese edad:");
edad2=teclado.nextInt();
System.out.print("La persona de mayor edad es:");
if (edad1>edad2) {
System.out.print(nombre1);
} else {
System.out.print(nombre2);
}*/