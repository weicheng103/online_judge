package syntaxPractice;

import java.util.Scanner;

public class A216 {
	// a216: 數數愛明明
	private static int f(int n) {
		if (n == 1)
			return 1;
		else
			return n + f(n - 1);
	}

	private static int g(int n) {
		if (n == 1)
			return 1;
		else
			return f(n) + g(n - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int day = scanner.nextInt();
			System.out.printf("%d %d%n", f(day), g(day));
		}
	}
}
