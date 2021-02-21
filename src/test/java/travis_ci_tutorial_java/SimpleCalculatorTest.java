package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testSubtract() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(5, 3), 2);
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, 5), 25);
	}
	
	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(5, 5), 1);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testDivideByZero() {
		try {
			SimpleCalculator calc = new SimpleCalculator();
			calc.divide(5,0);
			fail("Expected an IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Division by zero is not supported");
		} catch (Throwable t) {
			fail("Expected an IllegalArgumentException to be thrown");
		}
	}
	
	@Test
	public void testPower() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.power(2, 3), 8);
	}
}
