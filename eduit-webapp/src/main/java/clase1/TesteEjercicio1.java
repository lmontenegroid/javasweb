package clase1;

import junit.framework.TestCase;

public class TesteEjercicio1 extends TestCase{

	private Ejercicio1 ejercicio; //Declaro lo que voy a testear
	
	public void escenario() {
		ejercicio = new Ejercicio1(); //Inicializo el objeto a testear
	}
	
	public void testOperaciones() {
		escenario(); //Doy espacio dentro del método
		assertTrue(ejercicio.promedio(9, 8, 7, 6) == 7.5); //pruebo
	}
}
