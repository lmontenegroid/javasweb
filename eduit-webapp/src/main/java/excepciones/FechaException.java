package excepciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class FechaException extends Exception {

	private static final long serialVersionUID = 1L;

	public static Scanner teclado = new Scanner(System.in);

	public static String validarFecha() {

		int dia = 0, mes = 0, anio = 0;

		try {
			while (anio == 0) {
				System.out.println("Ingrese el año");
				anio = validarInt();
				if (anio < 1900 || anio > 2022) {
					System.err.println("El año debe estar entre 1900 y 2022");
					anio = 0;
				}
			}

			while (mes == 0) {
				System.out.println("Ingrese el mes");
				mes = validarInt();
				if (mes < 1 || mes > 12) {
					System.err.println("El mes debe estar comprendido entre 1 y 12");
					mes = 0;
				}
			}

			while (dia == 0) {
				System.out.println("Ingrese el dia");
				dia = validarInt();
				if (dia < 1 || dia > 31) {
					System.err.println("El día debe ser válido entre 1 y 31 (según el mes)");
					dia = 0;
				} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
					if (dia > 30) {
						System.err.println("Este mes no tiene ese día");
						dia = 0;
					}
				} else if (mes == 2) {
					if (anio % 400 == 0 || anio % 4 == 0) {
						if (dia > 29) {
							System.err.println("Este mes no tiene ese día");
							dia = 0;
						}
					} else if (dia > 28) {
						System.err.println("Este mes no tiene ese día");
						dia = 0;
					}
				}
			}

		} catch (Exception e) {
			System.err.println("Algo sucedió mal - " + e);
		}

		//LocalDate fecha = 
		
		return formato(LocalDate.of(anio , mes , dia));
	}

	public static int validarInt() {

		int valor;

		if (teclado.hasNextInt()) {
			valor = teclado.nextInt();
		} else {
			System.err.println("Número no válido");
			valor = 0;
		}
		teclado.nextLine();

		return valor;
	}

	public static String formato(LocalDate fecha) {

		// Crea un formateador de fechas con el patrón "dd/MM/yyyy"
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Convierte la fecha en una cadena de caracteres
        String fechaStr = fecha.format(formateador);
        
        return fechaStr;

	}

}
