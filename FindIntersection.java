package week1.day2.assignment2.arrays;

public class FindIntersection {

	public static void main(String[] args) {

		int[] a1 = { 3, 2, 11, 4, 6, 7 };
		int a2[] = { 1, 2, 8, 4, 9, 7 };

		System.out.println("Printing all the intersection values");
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j])
					System.out.println(a1[i]);
			}
		}
		System.out.println("Find only the first intersection and return:");
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					System.out.println(a1[i]);
					// break;
					// learning: break will not stop 2 loop
					return;
				}
			}
		}

	}

}
