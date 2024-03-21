package telran.strings;

public class Validations {
	public static boolean isArithmeticExpression(String expression) {

		String regex = RegularExpresions.arithmeticExpression();
		int counter = 0;
		int index = 0;
		int length = expression.length();
		while (index < length && counter > -1) {
			char ch = expression.charAt(index);
			if (ch == '(') {
				counter++;
			} else if (ch == ')') {
				counter--;
			}
			index++;
		}

		return counter == 0 && expression.matches(regex);
	}
}
