package syntaxPractice;

import java.util.Scanner;

public class A147 {
	// a147: Print it all
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			if (n != 0) {
				

				for (int i = 1; i < n; i++) {
					if (i > 0 && i % 7 != 0 && (i % 2 == 0 || i % 2 == 1)) {
						System.out.printf("%d ", i);
					}

				}
			}else{
				break;
			}
		}
	}

}
