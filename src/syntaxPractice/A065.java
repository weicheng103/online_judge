package syntaxPractice;

import java.util.Scanner;

public class A065 {
	// a065: 提款卡密碼
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			int len = str.length();
			char[] array = new char[len];

			array = str.toCharArray();

			int i = 0;
			do {
				int num;
				num = Math.abs(array[i] - array[i + 1]);
				System.out.print(num);
				i++;
			} while (i < len - 1);
			System.out.println();
		}
		// char[] alphabet = new char[26];
		// for (int i = 65; i <= 90; i++) {
		// int ascii = i;
		// char asciitochar = (char) ascii;
		// alphabet[i - 65] = asciitochar;
		// }
		//
		//
		// // for (char a : alphabet) { 測試轉換是否成功
		// // System.out.print(a+" ");
		// // }
		// int i=0;
		// do {
		//
		//
		//
		// i++;
		// } while (i < 7 - 1);
		//
		// System.out.println('B'-'A');
	}
}
