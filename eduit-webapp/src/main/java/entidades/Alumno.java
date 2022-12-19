package entidades;

import java.util.Arrays;
import java.util.Date;

public class Alumno extends Persona {

	private String[] listaCursos;

	public Alumno(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaIngreso, String[] listaCursos) {
		super(nombre, apellido, documento, fechaNacimiento, fechaIngreso);
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

	@Override
	public void rol() {
		System.out.println(getNombre()+ " " +getApellido() + " - Alumno");
		
	}

}
