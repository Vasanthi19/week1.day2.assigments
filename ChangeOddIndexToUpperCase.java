package week1.day2.assignment3.strings;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		ChangeOddIndexToUpperCase obj = new ChangeOddIndexToUpperCase();
		obj.justPrintChar(test);
		obj.stringBuffer(test);
	}

	public void justPrintChar(String test) {
		System.out.println(" Method justPrintChar:");
		for (int i = 0; i < test.length(); i++) {
			char c = test.charAt(i);
			if (i % 2 == 0) {
				System.out.print(c);
			} else
				System.out.print(Character.toUpperCase(c));
		}
	}

	public void stringBuffer(String test) {
		System.out.println("\n Method stringBuffer:");
		StringBuffer strNew = new StringBuffer();
		for (int i = 0; i < test.length(); i++) {
			if (i % 2 == 0) {
				strNew.append(test.charAt(i));
			} else {
				strNew.append(Character.toUpperCase(test.charAt(i)));
			}
		}
		System.out.println(strNew);
	}

}