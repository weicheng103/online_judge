package syntaxPractice;

import java.util.Scanner;

public class A002 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
//		String str1 = scanner.nextLine();
//		String str2 = scanner.nextLine();
//		
//		int num1 = Integer.valueOf(str1);
//		int num2 = Integer.valueOf(str2);
//		
//		int sum = num1 + num2;
//		System.out.println(sum);
		while(scanner.hasNextInt()){
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			System.out.println(num1 + num2);
			
		}
	}
}
