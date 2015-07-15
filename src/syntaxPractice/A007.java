package syntaxPractice;

import java.util.Scanner;

public class A007 {
	public static void main(String[] args) {
		// 判斷質數
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number. We can check it is a prime or not.");
		while (scanner.hasNext()) {
			
			int num = scanner.nextInt();
			int f = 0;
			for (int i = 1; i <= num; i++) {

				if ((num % i) == 0) {
					f++;
				}
			}
			if(f == 2)
				System.out.println(num+"是質數");
			else
				System.out.println(num+"不是質數");
		}
	}
}
