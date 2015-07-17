package syntaxPractice;

import java.util.Scanner;

public class A225 {
	// a225: 明明愛排列
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int quan = scanner.nextInt();
			String[] arr = new String[quan];

			for (int i = 0; i < quan; i++) {
				arr[i] = scanner.next();
			}

			for (int i = 0; i < quan - 1; i++) {
				for (int j = i + 1; j < quan; j++) {
					if (arr[i].charAt(arr[i].length() - 1) > arr[j].charAt(arr[j].length() - 1)) {
						String tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}

					if (arr[i].charAt(arr[i].length() - 1) == arr[j].charAt(arr[j].length() - 1)) {
						if (Integer.parseInt(arr[i]) < Integer.parseInt(arr[j])) {
							String tmp = arr[i];
							arr[i] = arr[j];
							arr[j] = tmp;
						}
					}
				}
			}

			for (String s : arr) {
				System.out.printf("%3s ", s);
			}
			System.out.println();
		}
	}
}
