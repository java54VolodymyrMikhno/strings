package telran.strings;

public class Validations {
	public static boolean isArithmeticExpression(String expression) {
		//1. Checking against the regular expression
		//2. checking brackets pairness For each'(' there should be')
		// consider introducing counter that increased for'(' and decreased for')'
		// if during passing over the string expression  counter < 0 returning false
 		//if after passing whole string counter!=0 returning false
		
		String regex = RegularExpresions.arithmeticExpression();
		if(!expression.matches(regex)) return false;
		
		
		int counter = 0;
		for (char ch  : expression.toCharArray()) {
			if(ch == '(') {
				counter++;
			}
			else if(ch == ')') {
				counter--;
				if(counter<0)return false;
			}
		}
		
		return counter==0;
	}
	
}
