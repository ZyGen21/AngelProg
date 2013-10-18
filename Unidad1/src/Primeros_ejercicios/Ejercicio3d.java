package Primeros_ejercicios;

import java.util.Scanner;

/*Calculen el área de un rectángulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.*/

public class Ejercicio3d {

	public static void main(String[] args) {
		double x1,x2,y1,y2,EjeX,EjeY,Area;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce la coordenada X1: ");
		x1 = teclado.nextDouble();
		System.out.print("Introduce la coordenada X2: ");
		x2 = teclado.nextDouble();
		System.out.print("Introduce la coordenada Y1: ");
		y1 = teclado.nextDouble();
		System.out.print("Introduce la coordenada Y2: ");
		y2 = teclado.nextDouble();

		EjeX = x2 - x1;
		EjeY = y2 - y1;
		Area = EjeX * EjeY;
		System.out.println("El área del círculo es: " + Area + " cm2");
	}

}
