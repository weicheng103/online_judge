
package syntaxPractice;

import java.util.Scanner;

public class A054 {
	// a054: 電話客服中心

	private static char f(String id) {
		int tmp = 0;
		int a = 1;
		int sum = 0;
		char alpha = ' ';
		for (int i = 0; i < 8; i++) {
			tmp = tmp + (8 - i) * Character.getNumericValue(id.charAt(i));
		}
		// tmp = tmp + Character.getNumericValue(id.charAt(8));
		sum = tmp + a;
		int n9 = Character.getNumericValue(id.charAt(8));
		if (n9 == 10 - sum % 10) {
			alpha = 'A';
		}
		return alpha;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			System.out.println(f(str));
		}
	}
}