package app;

import java.util.Date;
import java.util.Scanner;

import entidades.Alumno;
import entidades.Documento;
import entidades.Profesor;

public class Main {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int cantidad, cantidadCursos;

		String[] cursos;
		Alumno alumno;
		Alumno[] alumnos;
		Profesor[] profesores;
		Profesor profesor;
		String nombre, apellido, tipoDoc, numDoc;
		int dia, mes, anio;
		Date fechaNac, fechaIng;
		double sueldo;

		System.out.println("Ingresando alumnos al sistema");

		System.out.println("Cuántos alumnos desea ingresar?");
		cantidad = teclado.nextInt();

		alumnos = new Alumno[cantidad];

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

			fechaNac = new Date(dia, mes, anio);

			System.out.println("Ingrese dia de ingreso");
			dia = teclado.nextInt();

			System.out.println("Ingrese mes de ingreso");
			mes = teclado.nextInt();

			System.out.println("Ingrese anio de ingreso");
			anio = teclado.nextInt();

			fechaIng = new Date(dia, mes, anio);

			System.out.println("Ingrese la cantidad de cursos del alumno");
			cantidadCursos = teclado.nextInt();

			cursos = new String[cantidadCursos];

			for (int j = 0; j < cantidadCursos; j++) {
				System.out.println("Ingrese nombre de curso");
				cursos[j] = teclado.next();
			}

			alumno = new Alumno(nombre, apellido, new Documento(tipoDoc, numDoc), fechaNac, fechaIng, cursos);

			alumnos[i] = alumno;
		}

		System.out.println("Ingresando profesores al sistema");

		System.out.println("Cuántos profesores desea ingresar?");
		cantidad = teclado.nextInt();

		profesores = new Profesor[cantidad];

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

			fechaNac = new Date(dia, mes, anio);

			System.out.println("Ingrese dia de ingreso");
			dia = teclado.nextInt();

			System.out.println("Ingrese mes de ingreso");
			mes = teclado.nextInt();

			System.out.println("Ingrese anio de ingreso");
			anio = teclado.nextInt();

			fechaIng = new Date(dia, mes, anio);
			
			System.out.println("Ingrese el sueldo del profesor");
			sueldo = teclado.nextDouble();

			System.out.println("Ingrese la cantidad de cursos del profesor");
			cantidadCursos = teclado.nextInt();

			cursos = new String[cantidadCursos];

			for (int j = 0; j < cantidadCursos; j++) {
				System.out.println("Ingrese nombre de curso");
				cursos[j] = teclado.next();
			}

			profesor = new Profesor(nombre, apellido, new Documento(tipoDoc, numDoc), fechaNac, fechaIng, sueldo,cursos);

			profesores[i] = profesor;
		}

		
		System.out.println("Imprimiendo los " + cantidad + " alumnos.");
		
		for (Alumno alumnito : alumnos) {
			System.out.println(alumnito.toString());
		}

		System.out.println("\n");
		System.out.println("Imprimiendo los " + cantidad + " profesores.");
		
		for (Profesor profe : profesores) {
			System.out.println(profe.toString());
		}

		

	}

}
