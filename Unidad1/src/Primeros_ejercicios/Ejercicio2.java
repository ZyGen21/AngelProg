package Primeros_ejercicios;

import java.util.Scanner;

/*Escribir un programa que pregunte al usuario dos n�meros y 
 luego muestre la suma, el producto y la media de los dos n�meros.*/

public class Ejercicio2 {

	public static void main(String[] args) {
		double numero1,numero2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame dos n�meros, y calcular� con ellos: ");
		numero1 = teclado.nextDouble();
		numero2 = teclado.nextDouble();
		
		System.out.println("N�mero 1 " + numero1);
		System.out.println("N�mero 2 " + numero2);
		System.out.println("La suma " + (numero1+numero2));
		System.out.println("El producto " + numero1*numero2);
		System.out.println("La media " + (numero1+numero2)/2);
		
		teclado.close();
	}
}
