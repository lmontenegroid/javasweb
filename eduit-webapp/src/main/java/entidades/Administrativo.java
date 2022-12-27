package entidades;

import java.util.Date;

public class Administrativo extends Persona {

	// Atributos
	private double sueldo;

	public Administrativo(String nombre, String apellido, Documento documento, String fechaNacimiento, String fechaIngreso,
			double sueldo) {
		super(nombre, apellido, documento, fechaNacimiento, fechaIngreso);
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSueldo: " + sueldo + "\n";
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public void rol() {
		System.out.println(getNombre()+ " " +getApellido() + " - Administrativo");
		
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
		return "Administrativo";
	}

}
