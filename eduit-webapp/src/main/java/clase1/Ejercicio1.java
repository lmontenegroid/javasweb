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
		
		double numero1, numero2; //declaración de variables
		
		/*System.out.println("El usuario va a ingresar dos valores y se le "
				+ "aplicarán las cuatro operaciones en orden n1 n2.");
		
		System.out.println("Ingrese el primer valor");
		numero1 = teclado.nextDouble();
		
		System.out.println("Ingrese el segundo valor");
		numero2 = teclado.nextDouble();
		
		System.out.println("Suma: " + (numero1+numero2)
				+ "\nResta: " + (numero1-numero2)
				+ "\nMultiplicación: " + (numero1*numero2)
				+ "\nDivisión: " + (numero1/numero2));
		*/
		
		
		/*
		 2- Declare e inicie cuatro variables y muestre el promedio de ellas.
		 */
		
		double numero3 = 9, numero4 = 10;
		
		numero1 = 2;
		numero2 = 25;
		
		System.out.println("Promedio de los cuatro números: " + ((numero1 +
				numero2 + numero3 + numero4))/4);
		
		
	}

}
