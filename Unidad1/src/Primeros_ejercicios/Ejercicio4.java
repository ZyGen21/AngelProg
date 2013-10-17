package Primeros_ejercicios;

import java.util.Scanner;

/*Crea un programa que pida un peso en Kilogramos y realice la conversión a onzas,
  sabiendo que 1 Kilogramo (Kg) = 35.2739619 Onzas (oz)*/

public class Ejercicio4 {

	public static void main(String[] args) {
		
		float peso =0.0f;
		final float onzas_por_kilo = 35.2739619f;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu peso en kilogramos: ");
		peso = teclado.nextFloat();
		System.out.println("\n Tu peso en Onzas es: " + (peso * onzas_por_kilo) + " onzas");
	}

}
