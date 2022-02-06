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

}
