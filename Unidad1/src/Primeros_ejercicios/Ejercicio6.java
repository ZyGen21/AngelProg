package Primeros_ejercicios;

import java.util.Scanner;

/*Indica cual es el resultado de las siguientes expresiones 
 * y más tarde comprueba en Java el resultado:*/
/*	((4-2)*(5+1)/2)>2-(4+3)
	(6+3)>8 && (6-1)2 < 8 || 23==8
	(1.0 < X) && (X < Z+7.0) //donde X=7 y Z=2
	(PI * XX > Y || 2PI*X <= Z //donde X01, Y=4, Z=10, PI=3.14
	X>3 && Y==4 || X + Y <= Z //donde X=1, Y=4, Z=10
	X>3 && (Y==4 || X + Y <= Z) //donde X=1, Y=4, Z=10		*/

public class Ejercicio6 {

	public static void main(String[] args) {
		boolean v1,v2,v3,v4,v5,v6;
		double X,Y,Z,PI;
		
	v1 = ((4-2)*(5+1)/2)>2-(4+3) ;
	System.out.println ("El primer ejemplo es: " + v1);
	
	v2 = (6+3)>8 && (6-1) * 2 < 8 || 23==8 ;
	System.out.println ("El primer ejemplo es: " + v2);
	
	X = 7;
	Z = 2;
	v3 = (1.0 < X) && (X < Z+7.0) ;
	System.out.println ("El primer ejemplo es: " + v3);
	
	PI = Math.PI;
	X = 1;
	Y = 4;
	Z = 10;
	v4 = (PI * Math.pow(X, 2)) > Y || 2 * PI * X <= Z ;
	System.out.println ("El primer ejemplo es: " + v4);
	
	X = 1;
	Y = 4;
	Z = 10;
	v5 = X>3 && Y==4 || X + Y <= Z ;
	System.out.println ("El primer ejemplo es: " + v5);
	
	X = 1;
	Y = 4;
	Z = 10;
	v6 = X>3 && (Y==4 || X + Y <= Z) ;
	System.out.println ("El primer ejemplo es: " + v6);
	}

}
