package week1.day2.assignment3.strings;

public class RemoveDuplicates {

	/*
	 * Pseudo code
	 * 
	 * a) Use the declared String text as input String text =
	 * "We learn java basics as part of java sessions in java week1"; b) Initialize
	 * an integer variable as count c) Split the String into array and iterate over
	 * it d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. f) if the count > 1 then
	 * replace the word as ""
	 * 
	 * g) Displaying the String without duplicate words
	 */
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		//String text = "We learn basics of java as part of java sessions in java week1";

		String atext[] = text.split(" ");
		String duplicate = "";

		for (int i = 0; i < atext.length; i++) {
			int count = 0;
			for (int j = 0; j < atext.length; j++) {
				if (atext[i].equals(atext[j])) {
					count++;
				}
			}
			if (count > 1) {
				if(atext[i]!=" ")
				duplicate=atext[i]+","+duplicate;
				continue;
			}
		}
		String newtext="";
		String[] aDuplicate = duplicate.split(",");
		for (int j = 0; j < aDuplicate.length; j++) {
			newtext= text.replace(aDuplicate[j],"");
			text=newtext;
		}
		System.out.println("Test After removing all duplication: \n" + newtext);
	}

}
