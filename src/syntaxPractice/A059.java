package syntaxPractice;

import java.util.Scanner;

public class A059 {
	// a059: 完全平方和
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int set = scanner.nextInt();
		int[] set_sum = new int[set];
		while (scanner.hasNext()) {

			for (int i = 0; i < set; i++) {
//				for (int j = 0; j < 2; j++) {         NOTE:bug
					int sum = 0;
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
					set_sum[i] = sum;
//				}									NOTE:bug
			}
			
			for (int i = 0; i < set; i++) {
				System.out.println("case " + (i + 1) + ":" + set_sum[i]);
			}
		}

	}
}
