package syntaxPractice;

import java.util.Scanner;

public class A248 {
	// a248: 新手訓練 ~ 陣列應用
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			int n = scanner.nextInt();
			int[] arr = new int[10000 + 1];

			int quotient = a / b;
			String str = String.valueOf(quotient);
			int len = str.length();

			for (int i = 0; i < arr.length; i++) {
				arr[i] = a / b;
				a = (a % b) * 10;
			}

			System.out.printf("%d.", arr[0]);// 先印出商加上小數點

			for (int i = 1; i < n + 1; i++) {
				System.out.printf("%d", arr[i]);
			}

			System.out.println();
		}
	}
}
