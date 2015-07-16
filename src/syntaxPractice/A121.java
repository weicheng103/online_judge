package syntaxPractice;

import java.util.Scanner;

public class A121 {
	// a121: 質數又來囉
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int count = 0;
			if ((b - a) <= 1000) {
				for (int i = a ; i <= b; i++) {
					int factor = 0;
					for (int j = 1; j <= i; j++) {
						if (i % j == 0) {
							factor++;
						}
					}
					if (factor == 2) {
						count++;
					}
				}
				System.out.println(count);
			}
			else{
				System.out.println("b-a<=1000");
			}
		}
	}
}
