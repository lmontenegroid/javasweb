package comparadores;

import java.util.Comparator;

import entidades.Persona;

public class OrdenEdad implements Comparator<Persona> {
	@Override
	public int compare(Persona persona1, Persona persona2) {
		// como tenemos dos elementos debemos hacer un algoritmo un poco mas complejo

		return persona1.getFechaNacimiento().compareTo(persona2.getFechaNacimiento());

	}

}
