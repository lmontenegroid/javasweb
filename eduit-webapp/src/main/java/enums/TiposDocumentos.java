package enums;

public enum TiposDocumentos {
	DNI("Documento Nacional de Identidad"),
	PAS("Pasaporte Argentino"),
	LE("Libreta de Enrolamiento"),
	CI("Cedula de Identidad");

	private String descripcion;
	

	private TiposDocumentos(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
