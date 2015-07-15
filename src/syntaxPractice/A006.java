package syntaxPractice;

import java.util.Scanner;

public class A006 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input three integer a, b, c");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double state = b * b - 4 * a * c;
		double root1 = 0;
		double root2 = 0;

		if (state > 0) {
			root1 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			root2 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out.println("Two different roots x1=" + root1 + ", x2=" + root2);
		} else if (state == 0) {
			root1 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out.println("Two same roots x = " + root1);
		} else {
			System.out.println("No real root");
		}

		System.out.print(a + " " + b + " " + c);

	}
}
