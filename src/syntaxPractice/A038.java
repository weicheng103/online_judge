package syntaxPractice;

import java.util.Scanner;

public class A038 {
	// a038: 數字翻轉
	// public static void main(String[] args){
	//
	// Scanner scanner = new Scanner(System.in);
	// StringBuffer sb ;
	//
	// while(scanner.hasNext()){
	// sb = new StringBuffer(scanner.nextLine());
	// System.out.println(sb.reverse());
	// }
	//
	//
	// }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String str = scanner.next();
			char[] arr = str.toCharArray();

			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.print(arr[i]);
			}

		}
	}
}
