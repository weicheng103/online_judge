package syntaxPractice;

import java.util.Arrays;
import java.util.Scanner;

public class A149 {
	// a149: 乘乘樂
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int set = scanner.nextInt();
		String[] array = new String[set];
		int[] set_product = new int[set];
		
		Arrays.fill(set_product, 1);
		
		for (int i = 0; i < set; i++) {
			array[i] = scanner.next();
		}

		for (int i = 0; i < set; i++) {
			for (int j = 0; j < array[i].length(); j++) {
				set_product[i] = set_product[i] * Character.getNumericValue((array[i].charAt(j)));
			}
		}

		for (int i = 0; i < set; i++) {
			System.out.println(set_product[i]);
		}
	}
}
