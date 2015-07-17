package syntaxPractice;

import java.util.Scanner;

public class A224 {
	// a224: 明明愛明明
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String str = scanner.next();
			str = str.toUpperCase();
			
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<str.length();i++){
				//過濾非字母or數字
				if(Character.isLetterOrDigit(str.charAt(i))){
					sb.append(str.charAt(i));
				}
			}
			String ori = sb.toString();
			String rev = sb.reverse().toString();

			if (ori.equals(rev)) {
				System.out.printf("%s%n", "yes !");
			} else {
				System.out.printf("%s%n", "no...");
			}
		}
	}
}
