package entidades;

import java.util.Arrays;

public class Alumno extends Persona {

	private String[] listaCursos;

	public Alumno(String nombre, String apellido, Documento documento, int edad, String[] listaCursos) {
		super(nombre, apellido, documento, edad);
		this.listaCursos = listaCursos;
	}

	@Override
	public String toString() {
		return super.toString() + "\nLista de cursos: " + Arrays.toString(listaCursos) + "\n";
	}

	// gets n sets
	public String[] getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(String[] listaCursos) {
		this.listaCursos = listaCursos;
	}

}
