package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd1() {						
		Calculator calculator = new Calculator();
		assertEquals(calculator.add(1, 3), 4);
	}
	
	@Test
	void testAdd2() {						
		Calculator calculator = new Calculator();
		assertEquals(calculator.add(-1, 3), 2);
	}
}
