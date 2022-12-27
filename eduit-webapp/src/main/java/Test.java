import java.util.Date;

import entidades.Administrativo;
import entidades.Documento;
import entidades.Persona;
import enums.TiposDocumentos;
import junit.framework.TestCase;

public class Test extends TestCase{

	
	public void testDocumento() {
	
		Documento doc1 = new Documento(TiposDocumentos.DNI, "9147104");
		Documento doc2 = new Documento(TiposDocumentos.DNI, "9147104");
		
		Persona p = new Administrativo("Lucas", "Montenegro", doc2, new Date(9,9,9), new Date(8,8,8), 50000d);
		
		assertTrue(p.equals(doc1));
	}
}
