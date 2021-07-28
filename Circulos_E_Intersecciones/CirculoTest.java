package circuloeintersecciones;

import static org.junit.Assert.*;

import org.junit.Test;


public class CirculoTest {

	@Test
	public void inicializacionTest() {
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		assertNotNull(c1);
	}

	@Test
	public void intersectaTest() {
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		assertEquals(true, (c1.intersectaCon(c2) == true));
	}
	@Test
	public void noIntersectaTest() {
		Circulo c1 = new Circulo(new Punto(5, 5), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		assertEquals(false, (c1.intersectaCon(c2) == true));
	}
	@Test(expected = Error.class)
	public void valorRadioIncorrecto() {
		Circulo c1 = new Circulo(new Punto(0, 0), -4);
		}
}
