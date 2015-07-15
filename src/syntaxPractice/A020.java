package syntaxPractice;

import java.util.Scanner;

public class A020 {
	private static int pre(char prefix) {
		int tmp = 0;
		switch (prefix) {
		case 'A':
			int num = 10;
			int a = num / 10;
			int b = num % 10;
			tmp = a + b * 9;
			break;
		}
		return tmp;
	}

	public static void main(String[] args) {
		char[] array = new char[10];

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			array = scanner.nextLine().toCharArray();
			int validate = 0;
			int checksum = 0;
			for (int i = 1; i < 9; i++) {
				checksum += Character.getNumericValue(array[i]) * (9 - i);

			}
			// System.out.println(array);
			validate = pre(array[0]) + checksum + (Character.getNumericValue(array[9]));
			System.out.println(pre(array[0]));
			System.out.println(checksum);
			System.out.println(array[9]);
			System.out.println(validate);

			if (validate % 10 == 0) {
				System.out.println("real");
			} else {
				System.out.println("fake");
			}
		}
	}
}
