package syntaxPractice;

import java.util.Scanner;

public class A148 {
	// a148: You Cannot Pass?!
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int[] scores = new int[n];
			for (int i = 0; i < n; i++) {
				scores[i] = scanner.nextInt();
			}
			double sum=0;
			for(int i=0;i<n;i++){
				sum=sum+scores[i];
			}
			if((sum/n)>59)
				System.out.printf("no%n");
			else
				System.out.printf("yes%n");
			
		}

	}
}
