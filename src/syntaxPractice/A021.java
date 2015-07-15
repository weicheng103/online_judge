package syntaxPractice;

import java.math.BigDecimal;
import java.util.Scanner;

public class A021 {
	// a021: 大數運算
	public static void main(String[] args) {
		 BigDecimal a, b;
		 Scanner scanner = new Scanner(System.in);
		 a = new BigDecimal(scanner.nextBigInteger());
		 b = new BigDecimal(scanner.nextBigInteger());
		
		
		 System.out.println(a.add(b));
		 System.out.println(a.getClass());
//		Scanner scanner = new Scanner(System.in);
//		while (scanner.hasNext()) {
//			String a = scanner.nextLine();
//			String op = scanner.nextLine();
//			String b = scanner.nextLine();
//
//			switch (op) {
//			case "+":
//				System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
//				break;
//			case "-":
//				System.out.println(Integer.parseInt(a) - Integer.parseInt(b));
//				break;
//			case "*":
//				System.out.println(Integer.parseInt(a) * Integer.parseInt(b));
//				break;
//			case "/":
//				System.out.println(Integer.parseInt(a) / Integer.parseInt(b));
//				break;
//			}
//		}
	}
}
