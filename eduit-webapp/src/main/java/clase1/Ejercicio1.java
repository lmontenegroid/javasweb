package clase1;

import java.util.Scanner;

public class Ejercicio1 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		operaciones();

	}

	/*
	 * 1- Declare e inicie dos variables que permitan realizar y mostrar en consola
	 * las operaciones básicas matemáticas (suma, resta, multiplicación y división).
	 */
	public static void operaciones() {
		double numero1, numero2; // declaración de variables

		System.out.println(
				"El usuario va a ingresar dos valores y se le " + "aplicarán las cuatro operaciones en orden n1 n2.");

		System.out.println("Ingrese el primer valor");
		numero1 = teclado.nextDouble();

		System.out.println("Ingrese el segundo valor");
		numero2 = teclado.nextDouble();

		System.out.println("Suma: " + (numero1 + numero2) + "\nResta: " + (numero1 - numero2) + "\nMultiplicación: "
				+ (numero1 * numero2) + "\nDivisión: " + (numero1 / numero2));
	}

	/*
	 * 2- Declare e inicie cuatro variables y muestre el promedio de ellas.
	 */
	public static double promedio(double n1, double n2, double n3, double n4) {
		return (n1+n2+n3+n4)/4;
	}
	

}
