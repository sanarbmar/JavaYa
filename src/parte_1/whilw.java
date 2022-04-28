
package parte_1;

import java.util.Scanner;


public class whilw {
  
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
    }
    
}
/*/int x,nota;
        EJERCICIO 1
        x=1;
        int cantidadMayores=0;
        int cantidadMenores=0;
        while (x<=10) {
            System.out.print("Ingrese la primera nota:");
            nota=teclado.nextInt();
            if (nota >= 7) {
                cantidadMayores = cantidadMayores +1;
            }else{
                cantidadMenores = cantidadMenores + 1;
            }
            x=x + 1;
        }
        System.out.println("La cantidad notas sup a 10 son: "+cantidadMayores);
        System.out.println("La cantidad notas infe a 10 son: "+cantidadMenores);*/

/*
EJERCICIO 2
float altura,x=1,promedio,numAlturas,acom=0;
System.out.println("ingrese cuantas alturas va a calcular");
numAlturas = teclado.nextFloat();
while(x<=numAlturas){
System.out.println("ingrese una altura");
altura = teclado.nextFloat();
acom=acom+altura;
x = x +1;
}
promedio = acom / numAlturas;
System.out.println(promedio);*/

/*ejercicio 3
int numEmpleados,x=1,sueldo,acomMayores=0,acomMenores=0,acomSueldo=0;
System.out.print("cuantos empleados son ? : ");
numEmpleados=teclado.nextInt();
while(x <= numEmpleados){
System.out.print("escriba el suledo : ");
sueldo=teclado.nextInt();
acomSueldo=acomSueldo+sueldo;
if(sueldo >= 100 && sueldo <=300){
acomMenores=acomMenores+1;
}else{
acomMayores=acomMayores+1;
}
x = x +1;
}
System.out.println("numero de empleados que conran entre 100 y 300 : "+acomMenores);
System.out.println("numero de empleados que conran mas de 300 : "+acomMayores);
System.out.println("la empresa gasta "+acomSueldo+" en el pago a su personal");*/

/*ejercico 5
int num=11,x=1;
while(x <= 25){

System.out.println(num=num+11);
x=x+1;
}*/

/*ejercicio 6
int multiplo=0,x=1;
while(x <= 500){
System.out.println(multiplo=multiplo+8);
x=x+1;
}*/