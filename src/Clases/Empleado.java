/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author santiago
 */
public class Empleado {
    private Scanner scanner;
    private String nombre;
    private float sueldo;
    public void iniciar(){
        scanner = new Scanner(System.in);
        System.out.print("Escriba su nombre : ");
        nombre=scanner.next();
        System.out.print("Escriba su sueldo : ");
        sueldo=scanner.nextFloat();
    }
    public void imprimir(){
        System.out.println("Su nombre es : "+nombre);
        System.out.println("Su sueldo es : "+sueldo);
    }
    public void impuestos(){
        if (sueldo > 3000) {
            System.out.println("Debe pagar impuestos");
        }else{
        System.out.println("No Debe pagar impuestos");
        }
    }
}
