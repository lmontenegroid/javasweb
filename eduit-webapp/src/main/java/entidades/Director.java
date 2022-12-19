package entidades;

import java.util.Date;

public class Director extends Persona {

	// Atributos
	private String carrera;
	private double sueldo;

	public Director(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaIngreso,
			String carrera, double sueldo) {
		super(nombre, apellido, documento, fechaNacimiento, fechaIngreso);
		this.setCarrera(carrera);
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCarrera: " + carrera + "\nSueldo: " + sueldo + "\n";
	}
	
	@Override
	public void rol() {
		System.out.println(getNombre() + " " + getApellido() + " - Director");

	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}
