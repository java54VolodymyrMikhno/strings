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
	 return "\\+972-(5[0-9])-\\d{7}";
}
}
