package Primeros_ejercicios;

import java.util.Scanner;

/*Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.*/

public class Ejercicio3e {

	public static void main(String[] args) {
		double cateto1,cateto2,hipotenusa;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce la longitud del cateto 1: ");
		cateto1 = teclado.nextDouble();
		System.out.print("Introduce la longitud del cateto 2: ");
		cateto2 = teclado.nextDouble();
		hipotenusa = Math.sqrt(Math.pow(cateto1, 2)+ Math.pow(cateto2, 2));
		System.out.println("La longitud de la hipotenusa del triángulo es:" + hipotenusa + "cm");
	teclado.close();
	}

}
