package week1.day2.assignment3.strings;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	
	String text1 = "stops";
	String text2 = "potss"; 
	String text3 = ""; 
	
	if(text1.length()==text2.length()) {
		char[] ctext1=text1.toCharArray();
		char[] ctext2=text2.toCharArray();
		Arrays.sort(ctext1);
		Arrays.sort(ctext2);
		for (int i=0;i<ctext1.length;i++){
		if(ctext1[i]==ctext1[i])
			text3=text3+ctext1[i];
			}
		if (text3.length()==text1.length()) {
			System.out.println("Anagram");
		}
	}
	else 
		System.out.println("not an anagram");
}
}
