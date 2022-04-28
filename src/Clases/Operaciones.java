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
public class Operaciones {
    private Scanner scanner;
    private int valor1,valor2;
    
    public void iniciar(){
        scanner = new Scanner(System.in);
        System.out.println("v1 = ");
        valor1=scanner.nextInt();
        System.out.println("v2 = ");
        valor2=scanner.nextInt();
    }
    public int sumar(){
       return valor1+valor2;
    }
  
    public void imprimir(){
        System.out.println("la suma es : "+sumar());
    } 
}
/*public int restar(){
return valor1-valor2;
}
public int multiplicar(){
return valor1*valor2;
}
public int dividir(){
return valor1/valor2;
}*/