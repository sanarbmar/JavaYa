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
public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    }
}

/*EJER 2
int valores,cont=0;
for (int i = 1; i <= 10; i++) {
System.out.print("escriba un numero : ");
valores=scanner.nextInt();
if(i == 5 || i==6 || i==7 || i==8 || i==9 || i==10){
cont = cont + valores;

}
}
System.out.println(cont);*/

/*EJERCICIO 3
int cinco=5,tabla;
for (int i = 5; i <= 50; i++) {
tabla = cinco*i;
System.out.println(cinco+" x "+i+" = "+tabla);
}*/

/*EJERICIO 4
int f,valor,mult;
System.out.println("ingrese un valor de 1 a 10 ");
valor=scanner.nextInt();
for(f=1;f<=12;f++) {
mult=valor*f;
System.out.println(valor+" x "+f+" ="+mult);
}*/

/*EJERCICIO 5

int x,y,cantidadPuntos,c1=0,c2=0,c3=0,c4=0;
System.out.print("escriba la cantidad de puntos  a procesar : ");
cantidadPuntos=scanner.nextInt();
for (int i = 0; i < cantidadPuntos; i++) {
System.out.print("escriba la coordenada x :");
x=scanner.nextInt();
System.out.print("escriba la coordenada y :");
y=scanner.nextInt();
if(x>-1 && y>-1){
c1++;
}else if(x<1 && y>=1){
c2++;
}else if(x<1 && y<1){
c3++;
}else{
c4++;
}
}
System.out.println("en el cuadrante 1 hay : "+c1+"  puntos");
System.out.println("en el cuadrante 2 hay : "+c2+"  puntos");
System.out.println("en el cuadrante 3 hay : "+c3+"  puntos");
System.out.println("en el cuadrante 4 hay : "+c4+"  puntos");*/