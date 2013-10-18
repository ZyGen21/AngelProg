package Primeros_ejercicios;

import java.util.Scanner;

/*Crea un programa que pida el tama�o de un archivo (Mbytes) y la velocidad de una l�nea de 
datos (Mbps), y muestre el tiempo que tardar� en transmitirlo usando dicha l�nea.*/

public class Ejercicio5 {

	public static void main(String[] args) {
		double tama�o,velocidad;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el tama�o del archivo en MegaBytes: ");
		tama�o = teclado.nextDouble();
		System.out.print("Introduce la velocidad de la l�nea en MegaBits: ");
		velocidad = teclado.nextDouble();
		velocidad = (velocidad * 1000000);
		tama�o = tama�o * 1024 * 1024 * 8 ;
		System.out.print("Datos: " + tama�o + " bits");
		System.out.print("\nVelocidad: " + velocidad + " bps");
		System.out.println("\nEl tiempo que tardar� la transferencia es:" + tama�o/velocidad + "segundos");
	teclado.close();
	}

}
