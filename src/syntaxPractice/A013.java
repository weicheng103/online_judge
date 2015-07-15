package syntaxPractice;

import java.util.Scanner;

public class A013 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input1, input2;
		while (!(input1 = scanner.next()).equals("#")) {
			input2 = scanner.next();
			// System.out.println(toRome(Math.abs(toInt(input1) -
			// toInt(input2))));
		}
	}
}
//	private static int toInt(String s) {
//		int result = 0;
//		int sLen = s.length();
//		for (int i = 0; i < sLen; i++) {
//			char nCh = ' ';
//			if (i != sLen - 1)
//				nCh = s.charAt(i + 1);
////			switch (s.charAt(i)) {
////				case 'I':
//////					if(nCh =='I' ||nCh =='')
////						result +=1;
////					else
////						result-=1;
////					break;
////				case 'V':
////					result +=5;
////					break;
////				case 'X':
////					
////			}
//		}
//	}
//}
