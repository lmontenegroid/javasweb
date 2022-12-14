package clase1;

import java.util.Scanner;

public class Clase1 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		operaciones3(5, 5);

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
		return (n1 + n2 + n3 + n4) / 4;
	}

	// Declare e inicie 3 variables enteras y compare cual de las 3 es la mayor.
	public static double mayor(double n1, double n2) {
		return Math.max(n1, n2);
	}

	/*
	 * Declare e inicie 2 variables que permitan realizar y mostrar en consola las
	 * operaciones básicas matemáticas (suma, resta, división y multiplicación) pero
	 * con la opción de elegir cual operación realizar
	 */

	public static void operaciones2(double n1, double n2) {
		System.out.println("Seleccione que desea hacer con los valores recibidos\n");
		System.out.println(" 1- Sumar\n 2- Restar\n 3- Multiplicar\n 4- Dividir\n");
		System.out.println("Recuerde que si divide por cero, el programa explota.");
		int valor = teclado.nextInt();

		if (valor == 1) {
			System.out.println("La suma es " + (n1 + n2));
		}if (valor == 2) {
			System.out.println("La resta es " + (n1 - n2));
		}if (valor == 3) {
			System.out.println("La multiplicación es " + (n1 * n2));
		}if (valor == 4) {
			System.out.println("La division es " + (n1 / n2));
		}else {
			System.out.println("No ingresó un valor válido, el programa finalizará.");
		}

	}

	/*
	 * Del ejercicio anterior hacerlo con switch y que pueda aceptar el carácter ‘s’
	 * para sumar, ‘r’ para restar, ‘m’ para multiplicar y ‘d’ para dividir.
	 */
	public static void operaciones3(double n1, double n2) {
		System.out.println("Seleccione que desea hacer con los valores recibidos\n");
		System.out.println(" S- Sumar\n R- Restar\n M- Multiplicar\n D- Dividir\n");
		System.out.println("Recuerde que si divide por cero, el programa explota.");
		String valor = teclado.next().toLowerCase();

		switch (valor) {
		case "s":
			System.out.println("La suma es " + (n1 + n2));
			break;

		case "r":
			System.out.println("La resta es " + (n1 - n2));
			break;

		case "m":
			System.out.println("La multiplicación es " + (n1 * n2));
			break;

		case "d":
			System.out.println("La division es " + (n1 / n2));
			break;
		default:
			System.out.println("No ingresó un valor válido, el programa finalizará.");
			break;
		}
	}

}
