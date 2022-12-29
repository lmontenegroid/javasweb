package entidades;

import java.time.LocalDate;
import java.util.Arrays;

public class Profesor extends Persona {

	private double sueldo;
	private int[] listaCursos;

	public Profesor(String nombre, String apellido, Documento documento, LocalDate fechaNacimiento,LocalDate fechaIngreso,
			double sueldo, int[] listaCursos) {
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
	public int[] getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(int[] listaCursos) {
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
