package app;

import java.util.Scanner;

import entidades.Documento;
import entidades.Persona;

public class Main {

	public static void main(String[] args) {
		
		int cantidadPersonas;
		
		String nombre, apellido, tipoDoc, numDoc;
		Persona persona;
		Persona[] personas;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresando personas al sistema");
		
		System.out.println("Cuántas personas desea ingresar?");
		cantidadPersonas = teclado.nextInt();
		
		personas = new Persona[cantidadPersonas];
		
		for(int i=0; i<cantidadPersonas; i++) {
			System.out.println("Ingrese nombre");
			nombre = teclado.next();
			
			System.out.println("Ingrese apellido");
			apellido = teclado.next();
			
			System.out.println("Ingrese el tipo de documento");
			tipoDoc = teclado.next();
			
			System.out.println("Ingrese el numero de documento");
			numDoc = teclado.next();
			
			persona = new Persona(nombre, apellido, new Documento(tipoDoc, numDoc));
			
			personas[i] = persona;
		}
		
		
		for (Persona personita : personas) {
			System.out.println("Persona N° " +personita.getId());
			System.out.println("Nombre -> " + personita.getNombre());
			System.out.println("Apellido -> " +personita.getApellido());
			System.out.println("Tipo de documento ->" +personita.getDocumento().getTipo());
			System.out.println("Numero de documento ->" +personita.getDocumento().getNumero());
			System.out.println("Edad -> " +personita.getEdad());
			
		}
		System.out.println("Se ingresaron " +cantidadPersonas+ " cantidad de personas.");
		
		teclado.close();
		
	}

}
