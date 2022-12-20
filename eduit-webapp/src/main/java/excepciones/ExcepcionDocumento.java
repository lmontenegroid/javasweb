package excepciones;

import java.util.Arrays;

import interfaces.Constantes;

public class ExcepcionDocumento extends Exception{

	private static final long serialVersionUID = 1L;
	private Integer codigo;

	public ExcepcionDocumento(Integer codigo) {
		super();
		this.codigo = codigo;
	}

	public ExcepcionDocumento(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		switch (codigo) {
		case 1:
			return "Los Documentos validos son: " + Arrays.toString(Constantes.tipoDocumento);
		default:
			return super.getMessage();
		}
	}
}
