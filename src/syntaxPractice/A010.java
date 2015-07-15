package syntaxPractice;

import java.util.Scanner;
//因數分解
public class A010 {
	static int decom(int num) {
		int s = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				s = i;
				break;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input a num.");
		int num = scanner.nextInt();

		// for (int i = 2; i <= num; i++) {
		// if(num%i==0){
		// System.out.print(i+"*");
		// }
		// }
		while (num != 1) {
			int f = decom(num);
			num = num / f;
			if (num == 1)
				System.out.print(f);
			else 
				System.out.print(f + "*");

		}
	}
}
