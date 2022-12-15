package entidades;

public class Persona {

	// Atributos
	private String nombre;
	private String apellido;
	private Documento documento;
	private int edad;

	// Constructores
	public Persona() {

	}

	public Persona(String nombre, String apellido, Documento documento, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = edad;
	}
	
	public Persona(String nombre, String apellido, Documento documento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = (int) ((Math.random() * ((120 - 1) + 1)) + 1);
	}
	
	
	public boolean mayor(int n) {
		if(n>=18) {
			return true;
		}else {
			return false;
		}
	}

	
	//Gets n Sets
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
}
