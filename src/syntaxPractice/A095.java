package syntaxPractice;

import java.util.Scanner;

public class A095 {
	// a095: 麥哲倫的陰謀
	public static void main(String[] args) {
		int n, m;
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			n = scanner.nextInt();
			m = scanner.nextInt();

			if (n == m) {
				System.out.printf("%d", m);
			} else {
				System.out.printf("%d", m + 1);
			}
		}
	}
}
