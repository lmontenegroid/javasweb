package test;

import entidades.Persona;
import junit.framework.TestCase;

public class Test extends TestCase {

	private Persona persona;

	public void escenario() {
		persona = new Persona(); 
	}

	public void testMayor() {
		escenario(); 
		assertTrue(persona.mayor(18));
		assertTrue(persona.mayor(19));
		assertTrue(!persona.mayor(17));
	}
}
