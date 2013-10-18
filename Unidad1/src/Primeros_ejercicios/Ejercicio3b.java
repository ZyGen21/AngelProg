package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3b {

	public static void main(String[] args) {
		double radio;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Indica el radio de círculo: ");
		radio = teclado.nextDouble();
		teclado.close();
		System.out.println("El perímetro del círculo es: " + ((Math.PI)*radio)*2 + " cm");
		System.out.println("El área del círculo es: " + (radio*radio)*(Math.PI) + " cm2");
	teclado.close();
	}

}
