package clase1;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		/*
		 1- Declare e inicie dos variables que permitan realizar y mostrar
		 en consola las operaciones básicas matemáticas (suma, resta,
		 multiplicación y división).
		 */
		Scanner teclado = new Scanner(System.in);
		
		int numero1, numero2; //declaración de variables
		
		System.out.println("El usuario va a ingresar dos valores y se le "
				+ "aplicarán las cuatro operaciones en orden n1 n2.");
		
		System.out.println("Ingrese el primer valor");
		numero1 = teclado.nextInt();
		
		System.out.println("Ingrese el segundo valor");
		numero2 = teclado.nextInt();
		
		System.out.println("Suma: " + (numero1+numero2)
				+ "\nResta: " + (numero1-numero2)
				+ "\nMultiplicación: " + (numero1*numero2)
				+ "\nDivisión: " + (numero1/numero2));
		
		
	}

}
