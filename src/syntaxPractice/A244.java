package syntaxPractice;


import java.util.Scanner;

public class A244 {
	// a244: 新手訓練 ~ for + if
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[][] arr = new int[n][3];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				int tmp = scanner.nextInt();
				if (j == 0) {
					if (1 <= tmp && tmp <= 4) {
						arr[i][j] = tmp;
					}else{
						System.out.println("no");
					}
					
				}
				if (j == 1) {
					if (tmp >= 1) {
						arr[i][j] = tmp;
					}
				}
				if (j == 2) {
					if (tmp <= Integer.MAX_VALUE) {
						arr[i][j] = tmp;
					}
				}

			}
		}

		for (int i = 0; i < n; i++) {
			if (arr[i][0] == 1) {
				System.out.printf("%d%n", arr[i][1] + arr[i][2]);
			} else if (arr[i][0] == 2) {
				System.out.printf("%d%n", arr[i][1] - arr[i][2]);
			} else if (arr[i][0] == 3) {
				System.out.printf("%d%n", arr[i][1] * arr[i][2]);
			} else if (arr[i][0] == 4) {
				System.out.printf("%d%n", arr[i][1] / arr[i][2]);
			}
		}
	}
}
