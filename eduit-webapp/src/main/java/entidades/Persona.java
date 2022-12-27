package entidades;

import java.util.Date;

import interfaces.Acciones;

public abstract class Persona implements Acciones{

	// variable de clase
	public static int contador = 0;

	// Atributos
	private int id;
	private String nombre;
	private String apellido;
	private Documento documento;
	private String fechaNacimiento;
	private String fechaIngreso;

	// Constructores
	public Persona() {
		contador++;
		this.id = contador;
	}

	public Persona(String nombre, String apellido, Documento documento, String fechaNacimiento, String fechaIngreso) {
		contador++;
		this.id = contador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Legajo N° " + id + "\nNombre: " + nombre + "\nApellido: " + apellido + "\n" + documento.toString()
				+ "\nFecha de nacimiento: " + fechaNacimiento + "\nFecha de ingreso: " +fechaIngreso;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Documento doc = (Documento) obj;
		
		if(this.documento.tipo.toString().equals(doc.getTipo().toString())) {
			if(this.documento.numero.toString().equals(doc.getNumero().toString())) {
				return true;
			}
		}else {
			return false;
			
		}
		
		return false; 
		
		
	}

	public boolean mayor(int n) {
		return n >= 18;
	}
	
	public abstract void rol();

	// Gets n Sets
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
