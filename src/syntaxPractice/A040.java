package syntaxPractice;

import java.util.Scanner;

public class A040 {
	// a040: 阿姆斯壯數
	private static double f(int i) {
		int checknum = i;
		double sum = 0;
		String str = Integer.toString(checknum);
		int len = str.length();
		int fix = len;
		while (len != 0) {
//			int fix = len;             NOTE! : BUG
			sum = sum + Math.pow((Character.getNumericValue(str.charAt(len - 1))), fix);
			len--;

		}
		if (checknum != (int) sum)
			checknum = 0;

		return checknum;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		System.out.println(f(153));   TEST

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int q = 0;

		for (int i = n + 1; i < m; i++) {

			if (f(i) != 0) {
				System.out.print(i + " ");
				q++;
			}
		}
		
		if(q == 0){
			System.out.println("none");
		}
	}
}
