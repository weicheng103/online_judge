package syntaxPractice;

import java.util.Scanner;

public class A059 {
	// a059: 完全平方和
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int set = scanner.nextInt();
		while (scanner.hasNext()) {
			for (int i = 0; i < set; i++) {
				int sum = 0;
				for (int j = 0; j < 2; j++) {
					int a = scanner.nextInt();
					int b = scanner.nextInt();
					for (int k = a; k <= b; k++) {
						for (int l = 1; l < b; l++) {
							if (k == l * l) {
								 System.out.println(k);
								sum += k;
							}
						}
					}
					System.out.println("sum=" + sum);
				}
			}
		}

	}
}
