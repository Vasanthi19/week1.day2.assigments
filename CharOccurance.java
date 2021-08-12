package week1.day2.assignment3.strings;

import java.util.Arrays;
import java.util.HashSet;

public class CharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";
		char[] cStr = str.toCharArray();
		System.out.println("method1 output");
		method1(cStr);
		System.out.println("method2 output");
		method2(cStr);

	}

	private static void method2(char[] cStr) {
		int n = cStr.length;

		HashSet<Character> set = new HashSet<Character>(n - 1);
		for (char c : cStr)
			set.add(c);

		char[] newcStr = new char[set.size()];

		// Print content of the set
		int i = 0;
		for (char c : set)
			newcStr[i++] = c;
		System.out.println(newcStr);
		Arrays.sort(newcStr);
		for (int k = 0; k < newcStr.length - 1; k++) {
			int count = 0;
			for (int j = 0; j < cStr.length - 1; j++) {
				if (newcStr[k] == cStr[j])
					count++;
			}
			System.out.println("number of occurrences of " + newcStr[k] + " is " + count);
		}
	}

	public static void method1(char[] cStr) {
		System.out.println("number of occurrences list");
		for (int i = 0; i < cStr.length - 1; i++) {
			int count = 0;
			for (int j = 0; j < cStr.length - 1; j++) {
				if (cStr[i] == cStr[j])
					count++;
			}
			System.out.println(cStr[i] + " is " + count);

		}
	}
}
