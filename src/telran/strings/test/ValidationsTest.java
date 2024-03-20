package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.strings.Validations;

class ValidationsTest {

	@Test
	void test() {
		assertTrue(Validations.isArithmeticExpression("2+ 3.5 + a"));
		assertTrue(Validations.isArithmeticExpression("(20.5 + (abc - 3)*2)"));
		assertTrue(Validations.isArithmeticExpression("(2 + a12)*2"));
		assertTrue(Validations.isArithmeticExpression("2 + a12 "));
		assertTrue(Validations.isArithmeticExpression("(20.5 + abc12)*(a*2)-(AS/2.5)"));
		assertFalse(Validations.isArithmeticExpression("2+() 3"));
		assertFalse(Validations.isArithmeticExpression("(20.5 + (abc$ / 3)*(2"));
		assertFalse(Validations.isArithmeticExpression("(2 + )a12 * "));
		assertFalse(Validations.isArithmeticExpression("2 + a12 *"));
		assertFalse(Validations.isArithmeticExpression("(20.5 + abc12))*2"));
		assertTrue(Validations.isArithmeticExpression("2+ .5 + a"));
	}

}
