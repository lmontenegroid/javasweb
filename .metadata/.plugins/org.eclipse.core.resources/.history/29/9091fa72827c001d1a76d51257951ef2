package clase1;

import junit.framework.TestCase;

public class TestClase1 extends TestCase{

	private Clase1 ejercicio; //Declaro lo que voy a testear
	
	public void escenario() {
		ejercicio = new Clase1(); //Inicializo el objeto a testear
	}
	
	public void testOperaciones() {
		escenario(); //Doy espacio dentro del método
		assertTrue(ejercicio.promedio(9, 8, 7, 6) == 7.5); //pruebo
	}
	
	public void testMayor() {
		escenario(); //Doy espacio dentro del método
		assertTrue(ejercicio.mayor(9, 8) == 9); //pruebo
	}
}
