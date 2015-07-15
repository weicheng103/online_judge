package syntaxPractice;

import java.util.Scanner;

public class A053 {
	// a053: Sagit's 計分程式
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int score = 0;

		while (scanner.hasNext()) {
			
			num = scanner.nextInt();
			
			if (num >= 0 && num <= 10) {
				score = num * 6;
			}

			if (num >= 11 && num <= 20) {
				score = 60 + (num - 10) * 2;
			}

			if (num >= 21 && num <= 40) {
				score = 80 + (num - 20) * 1;
			}
			if(num>40){
				score = 100;
			}
			
			System.out.println(score);
		}
	}
}
