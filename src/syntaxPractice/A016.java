package syntaxPractice;

import java.util.Scanner;

public class A016 {
	// a016: 數獨(SUDOKU)
	public static void main(String[] args) {
		int[][] sudoku = new int[9][9];
		int status = 0;

		Scanner scanner = new Scanner(System.in);
		// 讀入sudoku陣列
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sudoku[i][j] = scanner.nextInt();
			}
		}

		int sum = (1 + 9) * 9 / 2;
        
//		檢查每個row
		for (int i = 0; i < 9; i++) {
			int tmp = 0;
			for (int j = 0; j < 9; j++) {
				tmp += sudoku[i][j];
			}
			if (tmp != sum)
				status=1;

		}
//		檢查每個column
		for (int i = 0; i < 9; i++) {
			int tmp = 0;
			for (int j = 0; j < 9; j++) {
				tmp += sudoku[j][i];
			}
			if (tmp != sum)
				status=1;

		}
		// 左上
		int tmp = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tmp += sudoku[i][j];
			}
		}
		if (tmp != sum) {
			status = 1;
		}
		tmp = 0;
		
//		中上
		
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j < 6; j++) {
				tmp += sudoku[i][j];
			}
		}
		if (tmp != sum) {
			status = 1;
		}
		tmp = 0;
		
//		右上
		
		for (int i = 0; i < 3; i++) {
			for (int j = 6; j < 9; j++) {
				tmp += sudoku[i][j];
			}
		}
		if (tmp != sum) {
			status = 1;
		}
		tmp = 0;
		
		
//		中左

		for (int i = 3; i < 6; i++) {
			for (int j = 0; j < 3; j++) {
				tmp += sudoku[i][j];
			}
		}
		if (tmp != sum) {
			status = 1;
		}
		tmp = 0;
		
//		中中
		for (int i = 3; i < 6; i++) {
			for (int j = 3; j < 6; j++) {
				tmp += sudoku[i][j];
			}
		}
		if (tmp != sum) {
			status = 1;
		}
		tmp = 0;
		
//		中右
		for (int i = 3; i < 6; i++) {
			for (int j = 6; j < 9; j++) {
				tmp += sudoku[i][j];
			}
		}
		if (tmp != sum) {
			status = 1;
		}
		tmp = 0;
		
//		左下

		for (int i = 6; i < 9; i++) {
			for (int j = 0; j < 3; j++) {
				tmp += sudoku[i][j];
			}
		}
		if (tmp != sum) {
			status = 1;
		}
		tmp = 0;
		
//		中下
		for (int i = 6; i < 9; i++) {
			for (int j = 3; j < 6; j++) {
				tmp += sudoku[i][j];
			}
		}
		if (tmp != sum) {
			status = 1;
		}
		tmp = 0;
		
//		右下
		
		for (int i = 6; i < 9; i++) {
			for (int j = 6; j < 9; j++) {
				tmp += sudoku[i][j];
			}
		}
		if (tmp != sum) {
			status = 1;
		}
		tmp = 0;

		// 以上檢查完
		if (status == 0)
			System.out.print("yes");
		else
			System.out.print("no");
	}
}
