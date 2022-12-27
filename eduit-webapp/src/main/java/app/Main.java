package app;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import comparadores.OrdenEdad;
import entidades.Administrativo;
import entidades.Alumno;
import entidades.Director;
import entidades.Documento;
import entidades.Persona;
import entidades.Profesor;
import enums.TiposDocumentos;
import excepciones.ExcepcionDocumento;
import excepciones.FechaException;

public class Main {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int cantidad, cantidadCursos;

		String[] cursos;
		Persona persona;
		Queue<Persona> personas;
		String nombre, apellido, numDoc, carrera;
		TiposDocumentos tipoDoc;
		String fechaNac;
		String fechaIng;
		double sueldo;
		byte rol;
		Documento documento;

		System.out.println("Ingresando personas al sistema");

		System.out.println("Cuántas personas desea ingresar?");
		cantidad = teclado.nextInt();

		OrdenEdad orden = new OrdenEdad();
		personas = new PriorityQueue<>(orden);

		for (int i = 0; i < cantidad; i++) {

			System.out.println("\nImprimiendo persona N° " + (i + 1) + "\n");

			System.out.println("Ingrese nombre");
			nombre = teclado.next();

			System.out.println("Ingrese apellido");
			apellido = teclado.next();

			while (true) {
				System.out.println("Ingrese el tipo de Documento");
				try {
					tipoDoc = TiposDocumentos.valueOf(teclado.next().toUpperCase());
					break;
				} catch (Exception e) {
					System.out.println(ExcepcionDocumento.getMessage(1));
				}

			}

			System.out.println("Ingrese el numero de documento");
			numDoc = teclado.next();

			documento = new Documento(tipoDoc, numDoc);

			while (true) {
				try {
					for (Persona persona2 : personas) {
						if (persona2 == null) {
							break;
						}
						while (persona2.equals(documento)) {
							System.err.println("El documento ya fue ingresado");
							System.out.println("Ingrese el numero de documento");
							numDoc = teclado.next();
							documento.setNumero(numDoc);
						}
					}
				} catch (Exception e) {
					System.err.println("Hubo un error");
				}
				break;
			}

			System.out.println("Nacimiento:");

			fechaNac = FechaException.validarFecha();

			System.out.println("Ingreso");

			fechaIng = FechaException.validarFecha();

			System.out.println("Ingrese el número del rol a ingresar\n" + "1- Director\n" + "2- Profesor\n"
					+ "3- Administrativo\n" + "4- Alumno\n");

			rol = teclado.nextByte();

			switch (rol) {
			case 1:
				System.out.println("Ingrese la carrera del director");
				carrera = teclado.next();
				System.out.println("Ingrese el sueldo del director");
				sueldo = teclado.nextDouble();
				persona = new Director(nombre, apellido, documento, fechaNac, fechaIng, carrera, sueldo);

				personas.add(persona);
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

				persona = new Profesor(nombre, apellido, documento, fechaNac, fechaIng, sueldo, cursos);

				personas.add(persona);

				break;
			case 3:
				System.out.println("Ingrese el sueldo del administrativo");
				sueldo = teclado.nextDouble();

				persona = new Administrativo(nombre, apellido, documento, fechaNac, fechaIng, sueldo);

				personas.add(persona);
				break;
			case 4:
				System.out.println("Ingrese la cantidad de cursos del alumno");
				cantidadCursos = teclado.nextInt();

				cursos = new String[cantidadCursos];

				for (int j = 0; j < cantidadCursos; j++) {
					System.out.println("Ingrese nombre de curso");
					cursos[j] = teclado.next();
				}

				persona = new Alumno(nombre, apellido, documento, fechaNac, fechaIng, cursos);

				personas.add(persona);
				break;

			default:
				System.out.println("Dato no encontrado.");
				break;
			}

		}

		System.out.println("\nAtendiendo a las personas\n");
		while(personas.size()>1) {
			System.out.println("Atendiendo a " + personas.poll().toString());
			System.out.println("Por atender a " + personas.element().getNombre());
		}
		System.out.println("Atendiendo a " + personas.poll().toString());
		System.out.println("No queda nadie por atender. Saludos!");

	}

}
