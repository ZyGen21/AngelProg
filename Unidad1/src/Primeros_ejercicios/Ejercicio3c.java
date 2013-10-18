package Primeros_ejercicios;

import java.util.Scanner;

/*Calculen el volumen de una esfera dado su radio.*/

public class Ejercicio3c {

	public static void main(String[] args) {
			double radio;
			Scanner teclado = new Scanner(System.in);
			System.out.print("Indica el radio de la esfera: ");
			radio = teclado.nextDouble();
			System.out.println("El volúmen de la esfera es: " + ((4*Math.PI*Math.pow(radio, 3)))/3);
	teclado.close();
	}

}
