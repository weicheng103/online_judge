package syntaxPractice;

import java.util.Scanner;

public class A044 {
	// a044: 空間切割
	private static int f(int n) {
		if (n == 0)
			return 1;
		else
			return f(n - 1) + ((n - 1) * (n - 1) + (n - 1) + 2) / 2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			System.out.println(f(n));
		}
	}
}
