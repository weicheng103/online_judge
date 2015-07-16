package syntaxPractice;

import java.util.Scanner;

public class A215 {
	// a215: 明明愛數數
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {

			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if (m - n < Math.pow(10, 5)) {
				int sum = 0;
				int count = 0;
				for (int i = n + 1;; i++) {
					sum += i;
					count++;
					if (sum > m) {
						System.out.println(count);
						break;
					}
				}
			}

			if (scanner.nextLine() == "EOF")
				break;
		}
	}
}
