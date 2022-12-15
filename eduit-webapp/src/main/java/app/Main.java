package app;


import java.util.Scanner;

import entidades.Alumno;
import entidades.Documento;


public class Main {

	public static void main(String[] args) {
		
		int cantidadAlumnos, cantidadCursos, edad;
		
		String nombre, apellido, tipoDoc, numDoc;
		String[] cursos;
		Alumno alumno;
		Alumno[] alumnos;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresando alumnos al sistema");
		
		System.out.println("Cuántos alumnos desea ingresar?");
		cantidadAlumnos = teclado.nextInt();
		
		alumnos = new Alumno[cantidadAlumnos];
		
		for(int i=0; i<cantidadAlumnos; i++) {
			System.out.println("Ingrese nombre");
			nombre = teclado.next();
			
			System.out.println("Ingrese apellido");
			apellido = teclado.next();
			
			System.out.println("Ingrese el tipo de documento");
			tipoDoc = teclado.next();
			
			System.out.println("Ingrese el numero de documento");
			numDoc = teclado.next();
			
			System.out.println("Ingrese la edad");
			edad = teclado.nextInt();
			
			System.out.println("Ingrese la cantidad de cursos del alumno");
			cantidadCursos = teclado.nextInt();
			
			cursos = new String[cantidadCursos];
			
			for (int j = 0; j < cantidadCursos; j++) {
				System.out.println("Ingrese nombre de curso");
				cursos[j] = teclado.next();
			}
			
			alumno = new Alumno(nombre, apellido, new Documento(tipoDoc, numDoc), edad, cursos);
			
			alumnos[i] = alumno;
		}
		
		
		for (Alumno alumnito : alumnos) {
			System.out.println(alumnito.toString());
		}
		
		
		System.out.println("Se ingresaron " +cantidadAlumnos+ " alumnos.");
		
		teclado.close();
		
	}

}
