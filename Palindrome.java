package week1.day2.assignment3.strings;

public class Palindrome {
	// Build a logic to find the given string is palindrome or not

	public static void main(String[] args) {
		String actual = "Madam";
		Palindrome obj = new Palindrome();
		
		System.out.println("Using just loop Method:");
		obj.justLoop(actual);
		
		System.out.println("Using StringBufffer Method:");
		obj.usingStringbuff(actual);

	}

	private void justLoop(String actual) {
		String rev="";
		for (int i = actual.length() - 1; i >= 0; i--) {
				char c= actual.charAt(i);
				rev=rev+c;
			}
			if(rev.equalsIgnoreCase(actual))
			System.out.println(actual + " is a palindrome");
		}
	

	public void usingStringbuff(String actual) {
		// Using String buffer
		StringBuffer rev = new StringBuffer();
		for (int i = actual.length() - 1; i >= 0; i--) {
			rev.append(actual.charAt(i));
		}
		if ((rev.toString()).equalsIgnoreCase(actual))
			System.out.println(actual + " is Palindrome");
	}
}