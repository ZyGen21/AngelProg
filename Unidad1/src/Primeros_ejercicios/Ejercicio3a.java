package Primeros_ejercicios;

import java.util.Scanner;

/*Escribe programas que:
 Calculen el per�metro y �rea de un rect�ngulo dada su base y su altura.*/
public class Ejercicio3a {

	public static void main(String[] args) {
		double base,altura;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Indica en cm la base del rect�ngulo: ");
		base = teclado.nextDouble();
		System.out.print("Indica en cm la altura del rect�ngulo: ");
		altura = teclado.nextDouble();
		teclado.close();
		System.out.println("El per�metro del rect�ngulo es: " + (base+altura)*2 + " cm");
		System.out.println("El �rea del rect�ngulo es: " + base*altura + " cm2");
	}

}
