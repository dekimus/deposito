import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
	

	@Test
	void testDepositoNivel() {
		DepositoCombustible dep = new DepositoCombustible(20.0,5.0);
		double res = dep.getDepositoNivel();
		assertEquals(5.0, res);
	}
	
	@Test
	void testDepositoMax() {
		DepositoCombustible dep = new DepositoCombustible(50.0,5.0);
		double res = dep.getDepositoMax();
		assertEquals(50.0, res);
	}
	
	@Test
	void testEstaVacio(){
		DepositoCombustible dep = new DepositoCombustible(20.0,5.0);
		dep.consumir(20);
		boolean res = dep.estaVacio();
		assertEquals(true, res);
	}
	
	@Test
	void testEstaLleno() {
		DepositoCombustible dep = new DepositoCombustible(20.0,5.0);
		dep.fill(15);
		boolean res = dep.estaLleno();
		assertEquals(true, res);
	}

}
