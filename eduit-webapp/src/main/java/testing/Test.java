package testing;

import java.time.LocalDate;

import entidades.Administrativo;
import entidades.Documento;
import entidades.Persona;
import enums.TiposDocumentos;
import excepciones.FechaException;
import junit.framework.TestCase;

public class Test extends TestCase {

	public void testDocumento() {

		Documento doc1 = new Documento(TiposDocumentos.DNI, "9147104");
		Documento doc2 = new Documento(TiposDocumentos.DNI, "9147104");

		Persona p = new Administrativo("Lucas", "Montenegro", doc2, "5/5/1996", "5/5/1996", 50000d);

		assertTrue(p.equals(doc1));
	}

	public void testFecha() {
		LocalDate fecha1 = LocalDate.of(1996, 1, 7);

		assertTrue(FechaException.formato(fecha1).equals("07/01/1996"));
	}
}
