package week1.day2.assignment3.strings;

public class FindTypes {
	
public static void main(String[] args) {
	
			String test = "$$ Welcome to 2nd Class of Automation $$ ";

			// Here is what the count you need to find
			int  letter = 0, space = 0, num = 0, specialChar = 0;

			char[] cTest=test.toCharArray();
			for(char c:cTest) {
				if(Character.isLetter(c))
					letter++;
				else if(Character.isDigit(c))
					num++;
				else if(Character.isSpaceChar(c))
					space++;
				else 
					specialChar++;	
			}
			// Print the count here
			System.out.println("letter: " + letter);
			System.out.println("space: " + space);
			System.out.println("number: " + num);
			System.out.println("specialCharcter: " + specialChar);

	
}
}
