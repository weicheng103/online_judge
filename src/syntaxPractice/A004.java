package syntaxPractice;

import java.util.Scanner;

public class A004 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0){
			System.out.println("閏年");
		}else{
			System.out.println("平年");
		}
	}
}
