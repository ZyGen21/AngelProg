package Primeros_ejercicios;

import java.util.Scanner;

/*Crea un programa que pida el tamaño de un archivo (Mbytes) y la velocidad de una línea de 
datos (Mbps), y muestre el tiempo que tardará en transmitirlo usando dicha línea.*/

public class Ejercicio5 {

	public static void main(String[] args) {
		double tamaño,velocidad,tiempo;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el tamaño del archivo: ");
		tamaño = teclado.nextDouble();
		System.out.print("Introduce la velocidad de la línea: ");
		velocidad = teclado.nextDouble();
		tiempo = ((tamaño*8)) / velocidad;
		System.out.println("El tiempo que tardará la transferencia es:" + tiempo + "segundos");
	teclado.close();
	}

}
