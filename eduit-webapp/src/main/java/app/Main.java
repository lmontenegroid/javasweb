package app;

import java.util.Date;
import java.util.Scanner;

import entidades.Administrativo;
import entidades.Alumno;
import entidades.Director;
import entidades.Documento;
import entidades.Persona;
import entidades.Profesor;

public class Main {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Alumno a = new Alumno("Juan", "Sanchez", new Documento("dni", "39147106"),
		 * new Date(07,05,1996), new Date(07,05,1996), new String[] {"html", "jsweb"});
		 * Alumno a2 = new Alumno("Juanes", "Sanchezes", new Documento("dni",
		 * "39147107"), new Date(07,05,1997), new Date(07,05,1997), new String[]
		 * {"htmls", "jswebs"});
		 */
		int cantidad, cantidadCursos;

		String[] cursos;
		Persona persona;
		Persona[] personas;
		String nombre, apellido, tipoDoc, numDoc, carrera;
		int dia, mes, anio;
		Date fechaNac, fechaIng;
		double sueldo;
		byte rol;

		System.out.println("Ingresando personas al sistema");

		System.out.println("Cuántas personas desea ingresar?");
		cantidad = teclado.nextInt();

		personas = new Persona[cantidad];

		for (int i = 0; i < cantidad; i++) {

			System.out.println("Ingrese nombre");
			nombre = teclado.next();

			System.out.println("Ingrese apellido");
			apellido = teclado.next();

			System.out.println("Ingrese el tipo de documento");
			tipoDoc = teclado.next();

			System.out.println("Ingrese el numero de documento");
			numDoc = teclado.next();

			System.out.println("Ingrese dia de nacimiento");
			dia = teclado.nextInt();

			System.out.println("Ingrese mes de nacimiento");
			mes = teclado.nextInt();

			System.out.println("Ingrese anio de nacimiento");
			anio = teclado.nextInt();

			fechaNac = new Date(anio - 1900, mes - 1, dia);

			System.out.println("Ingrese dia de ingreso");
			dia = teclado.nextInt();

			System.out.println("Ingrese mes de ingreso");
			mes = teclado.nextInt();

			System.out.println("Ingrese anio de ingreso");
			anio = teclado.nextInt();

			fechaIng = new Date(anio - 1900, mes - 1, dia);

			System.out.println("Ingrese el número del rol a ingresar\n" + "1- Director\n" + "2- Profesor\n"
					+ "3- Administrativo\n" + "4- Alumno\n");

			rol = teclado.nextByte();

			switch (rol) {
			case 1:
				System.out.println("Ingrese la carrera del director");
				carrera = teclado.next();
				System.out.println("Ingrese el sueldo del director");
				sueldo = teclado.nextDouble();
				persona = new Director(nombre, apellido, new Documento(tipoDoc, numDoc), fechaNac, fechaIng, carrera,
						sueldo);

				personas[i] = persona;
				break;
			case 2:
				System.out.println("Ingrese el sueldo del profesor");
				sueldo = teclado.nextDouble();

				System.out.println("Ingrese la cantidad de cursos del profesor");
				cantidadCursos = teclado.nextInt();

				cursos = new String[cantidadCursos];

				for (int j = 0; j < cantidadCursos; j++) {
					System.out.println("Ingrese nombre de curso");
					cursos[j] = teclado.next();
				}

				persona = new Profesor(nombre, apellido, new Documento(tipoDoc, numDoc), fechaNac, fechaIng, sueldo,
						cursos);

				personas[i] = persona;

				break;
			case 3:
				System.out.println("Ingrese el sueldo del administrativo");
				sueldo = teclado.nextDouble();

				persona = new Administrativo(nombre, apellido, new Documento(tipoDoc, numDoc), fechaNac, fechaIng,
						sueldo);

				personas[i] = persona;

				break;
			case 4:
				System.out.println("Ingrese la cantidad de cursos del alumno");
				cantidadCursos = teclado.nextInt();

				cursos = new String[cantidadCursos];

				for (int j = 0; j < cantidadCursos; j++) {
					System.out.println("Ingrese nombre de curso");
					cursos[j] = teclado.next();
				}

				persona = new Alumno(nombre, apellido, new Documento(tipoDoc, numDoc), fechaNac, fechaIng, cursos);

				personas[i] = persona;
				break;

			default:
				System.out.println("Dato no encontrado.");
				break;
			}

		}

		for (Persona p : personas) {
			System.out.println(p.toString());
		}
	}

}
