package syntaxPractice;

import java.util.Scanner;

public class A104 {
	// a104: 排序
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int quan = scanner.nextInt();
			System.out.println();
			int[] array = new int[quan];
			for (int i = 0; i < quan; i++) {
				array[i] = scanner.nextInt();
			}

			for (int i = 0; i < quan - 1; i++) {
				for (int j = i + 1; j < quan; j++) {
					if (array[i] > array[j]) {
						int tmp = array[i];
						array[i] = array[j];
						array[j] = tmp;
					}
				}
			}

			for (int sort : array) {
				System.out.printf("%d ",sort);
			}
		}
	}
}
