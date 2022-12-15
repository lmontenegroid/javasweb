package entidades;

public final class Documento {
	
	//Atributos
	String tipo;
	String numero;
	
	//Constructores
	public Documento(String tipo, String numero) {
		this.tipo = tipo;
		this.numero = numero;
	}
	
	
	@Override
	public String toString() {
		return "Tipo de documento: " + tipo + "\nNumero de documento: " + numero;
	}


	
	//Gets n Sets
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
}
