package syntaxPractice;

import java.util.Scanner;

public class A022 {
	// a022: 迴文
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String str = scanner.next();
			StringBuffer sb = new StringBuffer(str);
			String rev = sb.reverse().toString();
			
//			System.out.println(rev);

			if (str.equals(rev))
				System.out.println("yes");
			else
				System.out.println("no");

			// char[] Palindrome = str.toCharArray();
			// char[] tmp = {};

			// for (int i = Palindrome.length - 1; i >= 0; i--) {
			// tmp[-i] = Palindrome[i];
			//
			// }

		}
	}
}
