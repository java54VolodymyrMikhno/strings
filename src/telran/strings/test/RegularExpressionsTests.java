package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import telran.strings.RegularExpresions;

class RegularExpressionsTests {

	@Test
	void javaVariableTrueTest() {

		String regex = RegularExpresions.javaVariable();
		assertTrue("abs".matches(regex));
		assertTrue("a".matches(regex));
		assertTrue("$".matches(regex));
		assertTrue("$123".matches(regex));
		assertTrue("$1_23".matches(regex));
		assertTrue("abs_".matches(regex));
		assertTrue("__".matches(regex));
		assertTrue("Abs_".matches(regex));
	}

	@Test
	void javaVariableFalseTest() {
		String regex = RegularExpresions.javaVariable();
		assertFalse("1abc".matches(regex));
		assertFalse("_".matches(regex));
		assertFalse("a-2".matches(regex));
		assertFalse("a 2".matches(regex));
		assertFalse("a?2".matches(regex));
		assertFalse("i*nt".matches(regex));

	}

	@Test
	void zero_300TrueTest() {
		String regex = RegularExpresions.zero_300();
		assertTrue("0".matches(regex));
		assertTrue("1".matches(regex));
		assertTrue("19".matches(regex));
		assertTrue("198".matches(regex));
		assertTrue("299".matches(regex));
		assertTrue("30".matches(regex));
		assertTrue("33".matches(regex));
		assertTrue("300".matches(regex));

	}

	@Test
	void zero_300FalseTest() {
		String regex = RegularExpresions.zero_300();
		assertFalse("00".matches(regex));
		assertFalse("01".matches(regex));
		assertFalse("19s".matches(regex));
		assertFalse("398".matches(regex));
		assertFalse("2990".matches(regex));
		assertFalse("-30".matches(regex));
		assertFalse("330".matches(regex));
		assertFalse("301".matches(regex));

	}

	@Test
	void ipOctetTest() {
		String regex = RegularExpresions.ipOctet();
		assertTrue("0".matches(regex));
		assertTrue("00".matches(regex));
		assertTrue("000".matches(regex));
		assertTrue("10".matches(regex));
		assertTrue("7".matches(regex));
		assertTrue("19".matches(regex));
		assertTrue("199".matches(regex));
		assertTrue("009".matches(regex));
		assertTrue("255".matches(regex));
		assertTrue("250".matches(regex));
		assertTrue("249".matches(regex));
		assertFalse("-0".matches(regex));
		assertFalse("00 ".matches(regex));
		assertFalse("0000".matches(regex));
		assertFalse("10?".matches(regex));
		assertFalse("1900".matches(regex));
		assertFalse("299".matches(regex));
		assertFalse("00a".matches(regex));
		assertFalse("256".matches(regex));
		assertFalse("260".matches(regex));
		assertFalse("300".matches(regex));

	}

	@Test
	void mobileIsraelPhoneTest() {
		String regex = RegularExpresions.mobileIsraelPhone();
		assertTrue("+972-58-1234567".matches(regex));
		assertTrue("+972-55-7654321".matches(regex));
		assertTrue("+972-51-9876543".matches(regex));
		assertTrue("051-9876543".matches(regex));
		assertTrue("050-1234567".matches(regex));
		
		assertFalse("+972-10-7654321".matches(regex));
		assertFalse("+972-60-7654321".matches(regex));
		assertFalse("+972-55-12345677".matches(regex)); 
		assertFalse("+972-55-765432".matches(regex));
		assertFalse("972-55-1234567".matches(regex));
		assertFalse("97255-1234567".matches(regex));
		assertFalse("065-1234567".matches(regex));
		assertFalse("0651234567".matches(regex));
		assertFalse("165-1234567".matches(regex));
		assertFalse("055-234567".matches(regex));
		assertFalse("055-23456711".matches(regex));
		
	}
	@Test
	@DisplayName("test for IP v4 address regular expression")
	void ipV4AddressTest() {
		String ipV4Regex = RegularExpresions.ipV4Address();
		assertTrue("1.2.3.4".matches(ipV4Regex));
		assertFalse("1.2.3".matches(ipV4Regex));
		assertFalse("1 2.3.4".matches(ipV4Regex));
		assertFalse("1. 2.3.4".matches(ipV4Regex));
		assertFalse("1.2.3.4.5".matches(ipV4Regex));
		assertFalse("1.2.3&4".matches(ipV4Regex));
	}
	@Test
	@DisplayName("test of simple arithmetic expresiion")
	void simpleArithmeticExpressionsTest() {
		String regex = RegularExpresions.simpleArithmeticExpress();
		assertTrue("20".matches(regex));
		assertTrue(" 20 +3 /2 *100".matches(regex));
		assertTrue("1000-1".matches(regex));
		assertTrue("1000-1 ".matches(regex));
		assertFalse("-20".matches(regex));
		assertFalse("20 ** 3".matches(regex));
		assertFalse(" 20 +3 /2 *100 +".matches(regex));
		assertFalse(" 20 +3 //2 *100".matches(regex));
	}
	@Test
	@DisplayName("test arithmetic expressions with any numbers or variable names and brackets")
	void arithmeticExpressionTest() {
		String regex = RegularExpresions.arithmeticExpression();
		assertTrue("20".matches(regex));
		assertTrue(" 20 +3 /2 *100".matches(regex));
		assertTrue("1000-1".matches(regex));
		assertTrue("1000-1 ".matches(regex));
		assertFalse("-20".matches(regex));
		assertFalse("20 ** 3".matches(regex));
		assertFalse(" 20 +3 /2 *100 +".matches(regex));
		assertFalse(" 20 +3 //2 *100".matches(regex));
		assertTrue("(20.5 + abc12))*2".matches(regex));
		assertTrue("(20.5 + (abc$ / 3)*(2".matches(regex));
		assertTrue("(__)".matches(regex));
		assertTrue("2.5".matches(regex));
		assertFalse("2 + _".matches(regex));
		assertFalse("2 + a12 * ".matches(regex));
		assertFalse("(2 + )a12 * ".matches(regex));
		
	}

}
