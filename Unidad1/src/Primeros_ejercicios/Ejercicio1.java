package Primeros_ejercicios;

import java.util.Scanner;

/*Escribir un programa que pregunte al usuario su nombre y luego lo salude.*/

public class Ejercicio1 {

	public static void main(String[] args) {
		String nombre;
		Scanner input;
		
		System.out.println("�C�mo te llamas?");
		input = new Scanner(System.in);
		
		nombre=input.nextLine();
		System.out.println("Hola, "+nombre);
		input.close();
	}

}
