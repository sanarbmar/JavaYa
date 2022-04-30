
package Clases;


import java.util.Scanner;


public class Vectores {
    private Scanner scanner;
    private int[] vector;
    
    
}

/*Ejercicio 1

private int[] elementos;
public void cargar(){
scanner = new Scanner(System.in);
elementos = new int[8];
for (int i = 0; i < 8; i++) {
System.out.print("Ingrese un elemento : ");
elementos[i]=scanner.nextInt();
}
}
public void valorAcomulado (){
int suma=0;
for (int i = 0; i < elementos.length; i++) {
suma = suma + elementos[i];
}
System.out.println("el valor acomulado es : "+suma);
}
public void mayorQue36 (){
int suma=0;
for (int i = 0; i < elementos.length; i++) {
if (elementos[i]>36) {
suma = suma + elementos[i];
}
}
System.out.println("el valor acomulado de los > a 36 es : "+suma);
}
public void mayorQue50 (){
int suma=0;
for (int i = 0; i < elementos.length; i++) {
if (elementos[i]>50) {
suma = suma + elementos[i];

}
}
System.out.println("el valor acomulado de los > a 50 es : "+suma);
}*/

/*EJERCICIO 2

private int[] v1,v2,v3;
public void cargar(){

scanner = new Scanner(System.in);
v1 = new int[4];
v2 = new int[4];
System.out.println("VECTOR 1");
for (int i = 0; i < v1.length; i++) {
System.out.print("Ingrese un elemento : ");
v1[i]=scanner.nextInt();

}
System.out.println("VECTOR 2");
for (int i = 0; i < v1.length; i++) {
System.out.print("Ingrese un elemento : ");
v2[i]=scanner.nextInt();

}

}
public void sumarVectores(){
v3=new int[4];
for (int i = 0; i < v3.length; i++) {
v3[i]=v1[i] + v2[i];

}
for (int f = 0; f < v3.length; f++) {
System.out.println("Vector Restante : "+v3[f]);
}
System.out.println(Arrays.toString(v3));//para  mostrar array
}*/



/*EJERCICIO 3

private float[] notasA,notasB;
private float promedioA,promedioB,sumaA=0,sumaB=0;
public void cargar(){
scanner = new Scanner(System.in);
notasA=new float[5];
notasB=new float[5];
System.out.println("ingrese las notas del A ");
for (int i = 0; i < notasA.length; i++) {
System.out.print("ingrese una nota : ");
notasA[i]= scanner.nextFloat();
sumaA=sumaA+notasA[i];
}
System.out.println("ingrese las notas del B ");
for (int f = 0; f < notasB.length; f++) {
System.out.print("ingrese una nota : ");
notasB[f]= scanner.nextFloat();
sumaB=sumaB+notasB[f];
}
}

public void promedio(){
promedioA = sumaA/5;
promedioB = sumaB/5;
if (promedioA > promedioB) {
System.out.println("Promedio mayor es el del A :"+promedioA);
}else{
System.out.println("Promedio mayor es el del b :"+promedioB);
}

}*/


/*EJERCICIO 4

public void cargar(){
scanner = new Scanner(System.in);
vector = new int[10];
for (int i = 0; i < vector.length; i++) {
System.out.print("Ingrese un elemento : ");
vector[i]= scanner.nextInt();
}
}
public void ordernar(){
int orden=1;
for (int f = 0; f < 9; f++) {
if(vector[f+1]<vector[f]){
orden=0;

}
}
if(orden!=0){
System.out.println("esta ordenado de menor a mayor ");

}else{
System.out.println("esta ordenado de mayor a menor");
}
}*/
    