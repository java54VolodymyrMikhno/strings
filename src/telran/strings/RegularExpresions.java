package telran.strings;

public class RegularExpresions {
public static String javaVariable() {
	String regex ="[A-Za-z$][\\w$]*|_[\\w$]+";
	return regex;
}
public static String zero_300() {
	String regex = "[1-9]\\d?|[1-2]\\d\\d|300|0"; 
	return regex;
}
public static String ipOctet() {
	 return "25[0-5]|2[0-4][0-9]|[01]?[0-9]{1,2}";
	
}
public static String mobileIsraelPhone() {
	//TODO
	//string contains possible Israel mobile phone number
	//+972-<prefix two digits beginning from 5>-<7 digits of number>
	//<prefix three digits: first - 0, second 5, third - any>-<7 digits>
	
	 return "\\+972-(5[0-9])-\\d{7}";
}
}
