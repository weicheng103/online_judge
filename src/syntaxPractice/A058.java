package syntaxPractice;

import java.util.Scanner;

public class A058 {
	// a058: MOD3
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int k = 0;
			int k1 = 0;
			int k2 = 0;
			int quan = scanner.nextInt();
			int[] arr = new int[quan];
			for (int i = 0; i < quan; i++) {
				arr[i] = scanner.nextInt();
			}
			for (int i = 0; i < quan; i++) {
				if (arr[i] % 3 == 0) {
					k++;
				} else if (arr[i] % 3 == 1) {
					k1++;
				} else {
					k2++;
				}
			}
			System.out.printf("%d,%d,%d", k, k1, k2);

		}
	}
}
