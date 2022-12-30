package app;

import java.time.LocalDate;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import comparadores.OrdenEdad;
import conexiones.Acciones;
import entidades.Administrativo;
import entidades.Alumno;
import entidades.Cursos;
import entidades.Director;
import entidades.Documento;
import entidades.Persona;
import entidades.Profesor;
import enums.TiposDocumentos;
import excepciones.ExcepcionDocumento;
import excepciones.FechaException;

public class Main {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		/*
		Administrativo p = new Administrativo("Lucas", "Montenegro", new Documento(TiposDocumentos.DNI, "39147104"), LocalDate.of(2000, 9, 5),LocalDate.of(2000, 9, 5), 50000d);

		Acciones.agregar(p);*/
		
		
		int cantidad, cantidadCursos;

		Persona persona;
		Queue<Persona> personas;
		String nombre, apellido, numDoc, carrera;
		TiposDocumentos tipoDoc;
		LocalDate fechaNac;
		LocalDate fechaIng;
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

				persona = new Profesor(nombre, apellido, documento, fechaNac, fechaIng, sueldo,
						agregarCursos(cantidadCursos));

				personas.add(persona);

				break;
			case 3:
				System.out.println("Ingrese el sueldo del administrativo");
				sueldo = teclado.nextDouble();

				Acciones.agregar(new Administrativo(nombre, apellido, documento, fechaNac, fechaIng, sueldo));
				
				break;
			case 4:
				System.out.println("Ingrese la cantidad de cursos del alumno");
				cantidadCursos = teclado.nextInt();

				persona = new Alumno(nombre, apellido, documento, fechaNac, fechaIng, agregarCursos(cantidadCursos));

				personas.add(persona);
				break;

			default:
				System.out.println("Dato no encontrado.");
				break;
			}

		}
		
		
		

		/*
		System.out.println("\nAtendiendo a las personas\n");
		while (personas.size() > 1) {
			System.out.println("Atendiendo a " + personas.poll().toString());
			System.out.println("Por atender a " + personas.element().getNombre());
		}
		System.out.println("Atendiendo a " + personas.poll().toString());
		System.out.println("No queda nadie por atender. Saludos!");*/

	}

	private static int[] agregarCursos(int cantidad) {
		int[] cursos = new int[cantidad];

		for (int i = 0; i < cursos.length; i++) {
			while (true) {
				System.out.print("Ingrese el curso [" + (i + 1) + "] : ");
				String curso = teclado.next();
				int idCurso = validarCurso(curso);
				if (idCurso != -1) {
					cursos[i] = idCurso;
					break;
				}
				System.err.println("debe ingresar un curso valido: " + Cursos.getCursos().values());
			}
		}
		return cursos;
	
	}

	// metodo para validar los cursos
	private static int validarCurso(String curso) {
		Map<Integer, String> cursos = Cursos.getCursos();

		if (cursos.containsValue(curso)) {
			for (Entry<Integer, String> cursoAuxiliar : cursos.entrySet()) {
				if (cursoAuxiliar.getValue().equalsIgnoreCase(curso)) {
					return cursoAuxiliar.getKey();
				}
			}
		}

		return -1;
	}

}
