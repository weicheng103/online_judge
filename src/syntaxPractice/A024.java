package syntaxPractice;

import java.util.Scanner;

public class A024 {
	// a024: 最大公因數(GCD)
	private static int GCD(int a, int b) {
		if (a % b != 0)
			return GCD(b, a % b);
		else
			return b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();

		System.out.println("GCD:" + GCD(a, b));
	}
}
