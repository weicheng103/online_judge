package syntaxPractice;

import java.util.Scanner;

public class A009 {
//	a009: 解碼器
	public static void main(String[] args) {
		// int AscCode = 65;
		// char int2asc = (char)AscCode;
		// System.out.println(int2asc+2);
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String str = scanner.nextLine().toString();
			char[] array = str.toCharArray();
			for (int i = 0; i < array.length; i++) {
				System.out.print((char)(array[i]-7));
			}
		}

	}
}
