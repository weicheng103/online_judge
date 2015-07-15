package syntaxPractice;

import java.util.Scanner;

public class A034 {
	// a034: 二進位制轉換
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		StringBuffer sb = new StringBuffer();
		String str;
		while (num != 0) {
			int s = num % 2;
			sb.append(s);
//			System.out.print(s);
			num /= 2;
		}
		sb.reverse();
		System.out.println(sb);
	}
}
