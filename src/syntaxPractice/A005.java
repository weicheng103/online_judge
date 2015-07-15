package syntaxPractice;

import java.util.Scanner;

public class A005 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
//		int[] array = new int[5];
		
//		
//		
		
		while (scanner.hasNext()) {
			int a0 = scanner.nextInt();
			int a1 = scanner.nextInt();
			int a2 = scanner.nextInt();
			int a3 = scanner.nextInt();

			if ((a1 - a0) == (a2 - a1)) { // 等差
				int d = a1 - a0;
				System.out.print(a0 + " " + a1 + " " + a2 + " " + a3 + " " + (a3 + d));
			} else {// 等比
				int r = a3 / a2;
				System.out.print(a0 + " " + a1 + " " + a2 + " " + a3 + " " + (a3 * r));
			}
		}
			
//		while(scanner.hasNext()){
//			int a0 = scanner.nextInt();
//			int a1 = scanner.nextInt();
//			int a2 = scanner.nextInt();
//			int a3 = scanner.nextInt();
//			int a4  = 0;
//			
//			if((a1 - a0) == (a2 - a1)){ //等差
//				int d = a1 - a0;
//				System.out.print(a0+" "+a1+" "+a2+" "+a3+" "+(a3 + d));
//			}else{//等比
//				int r = a3 / a2;
//				System.out.print(a0+" "+a1+" "+a2+" "+a3+" "+(a3 * r));
//			}
//		}

		}
		
		
		
	}

