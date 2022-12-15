package entidades;

public class Persona {

	// Atributos
	String nombre;
	String apellido;
	Documento documento;
	int edad;

	// Constructores
	public Persona() {

	}

	public Persona(String nombre, String apellido, Documento documento, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = edad;
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
