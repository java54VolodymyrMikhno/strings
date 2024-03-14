package telran.strings;

public class RegularExpresions {
public static String javaVariable() {
	String regex ="[A-Za-z$][\\w$]*|_[\\w$]+";
	return regex;
}
public static String zero_300() {
	//TODO
	//string contains number from 0 - 300; leading zeros are disallowed
	String regex = "[1-9]\\d?|[1-2]\\d\\d|300|0"; 
	return regex;
}
public static String ipOctet() {
	//TODO
	//string contains 1 - 3 symbols presenting number from 0 - 255;
	// leading zeros are allowed
	return null;
}
public static String mobileIsraelPhone() {
	//TODO
	//string contains possible Israel mobile phone number
	//+972-<prefix two digits beginning from 5>-<7 digits of number>
	//<prefix three digits: first - 0, second 5, third - any>-<7 digits>
	
	return null;
}
}
