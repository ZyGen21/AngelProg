package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3b {

	public static void main(String[] args) {
		double radio;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Indica el radio de c�rculo: ");
		radio = teclado.nextDouble();
		teclado.close();
		System.out.println("El per�metro del c�rculo es: " + ((Math.PI)*radio)*2 + " cm");
		System.out.println("El �rea del c�rculo es: " + (radio*radio)*(Math.PI) + " cm2");
	teclado.close();
	}

}
