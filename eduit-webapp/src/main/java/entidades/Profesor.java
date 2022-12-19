package entidades;

import java.util.Arrays;
import java.util.Date;

public class Profesor extends Persona {

	private double sueldo;
	private String[] listaCursos;

	public Profesor(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaIngreso,
			double sueldo, String[] listaCursos) {
		super(nombre, apellido, documento, fechaNacimiento, fechaIngreso);
		this.sueldo = sueldo;
		this.listaCursos = listaCursos;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSueldo: " + sueldo + "\nLista de cursos: " + Arrays.toString(listaCursos) + "\n";
	}

	@Override
	public void rol() {
		System.out.println(getNombre() + " " + getApellido() + " - Profesor");

	}

	// gets n sets
	public String[] getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(String[] listaCursos) {
		this.listaCursos = listaCursos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
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
		return "Profesor";
	}

}
