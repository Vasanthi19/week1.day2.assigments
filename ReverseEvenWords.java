package week1.day2.assignment3.strings;

public class ReverseEvenWords {

	
	public static void main(String[] args) {
		
		String test = "I am a software tester";
		String[] aTest = test.split(" ");
		String toPrint = "";
		String finalString = "";
		
		for (int i = 0; i < aTest.length; i++) {
			int k = i + 1;
			if (k % 2 == 0 || k == 0) {
				char[] aTestChar = (aTest[i].toCharArray());
				String rev = "";
				for (int j = (aTestChar.length) - 1; j >= 0; j--) {
					rev += aTestChar[j];
				}
				toPrint = rev;
			} else
				toPrint = aTest[i];
			finalString=(finalString+toPrint+" ");
		}	System.out.println(finalString);
	}

}
