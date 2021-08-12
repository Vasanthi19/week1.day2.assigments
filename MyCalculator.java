package week1.day2.assignment1.classandmethods;

public class MyCalculator {

	public static void main(String[] args) {

		int num1 = 3, num2 = 2, num3 = 1;
		double dnum1 = 0.1, dnum2 = 0.2;
		float fnum1 = 1.1f, fnum2 = 2.2f;
		
		System.out.println("---calling methods using instance---");
		Calculator c = new Calculator();
		System.out.println(c.add(num1, num2, num3));// it should return sum of num1+num2+num3
		System.out.println(c.sub(num1, num2));// it should return subtraction of of num1-num2
		System.out.println(c.mul(dnum1, dnum2));// it should return product of num1 * num2
		System.out.println(c.divide(fnum1, fnum2));// it should return division of num1 / num2

		// calling static methods of a class
		System.out.println("---calling static methods of a class---");
		System.out.println(StaticCalculator.add(num1, num2, num3));// it should return sum of num1+num2+num3
		System.out.println(StaticCalculator.sub(num1, num2));// it should return subtraction of of num1-num2
		System.out.println(StaticCalculator.mul(dnum1, dnum2));// it should return product of num1 * num2
		System.out.println(StaticCalculator.divide(fnum1, fnum2));// it should return division of num1 / num2
	}

}
