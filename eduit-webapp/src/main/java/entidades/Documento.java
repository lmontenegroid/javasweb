package entidades;

import enums.TiposDocumentos;

public final class Documento {
	
	//Atributos
	TiposDocumentos tipo;
	String numero;
	
	//Constructores
	public Documento(TiposDocumentos tipo, String numero) {
		this.tipo = tipo;
		this.numero = numero;
	}
	
	
	@Override
	public String toString() {
		return "Tipo de documento: " + tipo + "\nNumero de documento: " + numero;
	}


	
	//Gets n Sets
	
	public TiposDocumentos getTipo() {
		return tipo;
	}

	public void setTipo(TiposDocumentos tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
}
