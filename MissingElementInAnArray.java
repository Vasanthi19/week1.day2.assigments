package week1.day2.assignment2.arrays;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		for (int j = 0; j < arr.length; j++) {
				if (arr[j] != j+1) {
					System.out.println(j+1);
				break;
				}
			}
	}

}
