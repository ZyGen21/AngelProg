package Primeros_ejercicios;

import java.util.Scanner;

/*Crea un programa que pida el tama�o de un archivo (Mbytes) y la velocidad de una l�nea de 
datos (Mbps), y muestre el tiempo que tardar� en transmitirlo usando dicha l�nea.*/

public class Ejercicio5 {

	public static void main(String[] args) {
		double tama�o,velocidad,tiempo;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el tama�o del archivo: ");
		tama�o = teclado.nextDouble();
		System.out.print("Introduce la velocidad de la l�nea: ");
		velocidad = teclado.nextDouble();
		tiempo = ((tama�o*8)) / velocidad;
		System.out.println("El tiempo que tardar� la transferencia es:" + tiempo + "segundos");
	teclado.close();
	}

}
