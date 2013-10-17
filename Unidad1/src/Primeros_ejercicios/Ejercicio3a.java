package Primeros_ejercicios;

import java.util.Scanner;

/*Escribe programas que:
 Calculen el perímetro y área de un rectángulo dada su base y su altura.*/
public class Ejercicio3a {

	public static void main(String[] args) {
		double base,altura;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Indica en cm la base del rectángulo: ");
		base = teclado.nextDouble();
		System.out.print("Indica en cm la altura del rectángulo: ");
		altura = teclado.nextDouble();
		teclado.close();
		System.out.println("El perímetro del rectángulo es: " + (base+altura)*2 + " cm");
		System.out.println("El área del rectángulo es: " + base*altura + " cm2");
	}

}
