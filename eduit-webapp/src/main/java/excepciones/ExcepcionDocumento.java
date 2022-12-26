package excepciones;
import java.util.Arrays;

import enums.TiposDocumentos;

public class ExcepcionDocumento extends Exception{

	private static final long serialVersionUID = 1L;


	public static String getMessage(int codigo) {
		switch (codigo) {
		case 1:
			return "Los Documentos validos son: " + Arrays.toString(TiposDocumentos.values());
		default:
			return null;
		}
		
	}
}
