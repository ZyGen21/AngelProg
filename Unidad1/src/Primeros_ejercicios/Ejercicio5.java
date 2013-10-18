package Primeros_ejercicios;

import java.util.Scanner;

/*Crea un programa que pida el tamaño de un archivo (Mbytes) y la velocidad de una línea de 
datos (Mbps), y muestre el tiempo que tardará en transmitirlo usando dicha línea.*/

public class Ejercicio5 {

	public static void main(String[] args) {
		double tamaño,velocidad;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el tamaño del archivo en MegaBytes: ");
		tamaño = teclado.nextDouble();
		System.out.print("Introduce la velocidad de la línea en MegaBits: ");
		velocidad = teclado.nextDouble();
		velocidad = (velocidad * 1000000);
		tamaño = tamaño * 1024 * 1024 * 8 ;
		System.out.print("Datos: " + tamaño + " bits");
		System.out.print("\nVelocidad: " + velocidad + " bps");
		System.out.println("\nEl tiempo que tardará la transferencia es:" + tamaño/velocidad + "segundos");
	teclado.close();
	}

}
