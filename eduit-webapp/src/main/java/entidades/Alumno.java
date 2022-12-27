package entidades;

import java.util.Arrays;

public class Alumno extends Persona {

	private int[] listaCursos;

	public Alumno(String nombre, String apellido, Documento documento, String fechaNacimiento, String fechaIngreso, int[] listaCursos) {
		super(nombre, apellido, documento, fechaNacimiento, fechaIngreso);
		this.listaCursos = listaCursos;
	}
	
	

	@Override
	public String toString() {
		return super.toString() + "\nLista de cursos: " + Arrays.toString(listaCursos) + "\n";
	}

	// gets n sets
	public int[] getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(int[] listaCursos) {
		this.listaCursos = listaCursos;
	}

	@Override
	public void rol() {
		System.out.println(getNombre()+ " " +getApellido() + " - Alumno");
		
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String identificar() {
		// TODO Auto-generated method stub
		return "Alumno";
	}


}
