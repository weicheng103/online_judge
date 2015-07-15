package syntaxPractice;

import java.util.Scanner;

public class A015 {
//	public static void main(String[] args) {
//		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(arr[i][j]);
//				if(j==2)
//					System.out.println("");
//			}
//		}
//		System.out.println("轉置");
//		for(int i=0;i<3;i++){
//			
//			for(int j=0;j<3;j++){
//				System.out.print(arr[j][i]);
//				if(j==2)
//					System.out.println("");
//				}
//			
//			}
//		}
	
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			while(scanner.hasNext()){
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				
				int array[][] = new int [num1][num2];
				
//				讀array
				for(int r=0;r<num1;r++){
					for(int c=0;c<num2;c++){
						array[r][c] = scanner.nextInt();
					}
				}
				
//				轉置
				for(int c=0;c<num2;c++){
					for(int r=0;r<num1;r++){
						System.out.print(array[r][c]+" ");
					}
					System.out.println("");
				}
				
			}
		}

	}

