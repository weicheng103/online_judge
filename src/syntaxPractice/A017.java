package syntaxPractice;

import java.util.Scanner;
import java.util.Stack;

public class A017 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			String[] s = str.split(" ");
			char[] c = new char[s.length];
			
			for(int i = 0; i < s.length; i++){
				c[i] = s[i].charAt(0);
			}
			
			System.out.println(ChangeToInfix(ChangetoPostfix(c)));
		}
	}

	static char[] ChangetoPostfix(char c[]) {
		StringBuffer sb = new StringBuffer();
		Stack<Character> stack = new Stack<Character>();
		char op;
		for (int i = 0; i < c.length; i++) {
			op = c[i];
			// 如果是運算子
			if (Character.isDigit(op))
				sb.append(op);
			else if (op == '(') {
				stack.push(op);
			} else if (op == ')') { // 遇到 ) 時,若stack.peek()的不是 ( ,就一直pop()出來
				while (stack.peek() != '(') { // stack.peek():傳回Top的值 ，而不移除他
					sb.append(stack.pop());
				}
				stack.pop(); // 拿出 (
			}
			else {
				while (true) {
					if (stack.empty()) {
						stack.push(op);
						break;
					} else {
						if (getPriority(op) <= getPriority(stack.peek())) {
							sb.append(stack.pop()); // 如果輸入的優先序小於stack.peek()就pop
						} else {
							stack.push(op);
							break;
						}
					}
				}
			}
		}
		while (!stack.empty()) { // 將剩下在堆疊裡的element都拿出來
			sb.append(stack.pop());
		}
		return sb.toString().toCharArray();
	}
	
	static int getPriority(char c) {
		switch(c){
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
			case '%':
				return 2;
			default:
				return 0;

		}
	}
	
	static int ChangeToInfix(char[] p){
		Stack<Integer> stack = new Stack<Integer>();
		char token;
		for(int i = 0; i < p.length; i++){
			token = p[i];
			if(Character.isDigit(token)){
				stack.push(Integer.parseInt(String.valueOf(p[i])));
			}else {
				stack.push(getCal(stack.pop(), stack.pop(), token));
			}
		}
		return stack.pop();
	}
	
	static int getCal(int i2, int i1, char token){
		switch(token){
		case '+':
			return i1 + i2;
		case '-':
			return i1 - i2;
		case '*':
			return i1 * i2;
		case '/':
			return i1 / i2;
		case '%':
			return i2 % i1;
		}
		return 0;
	}
}
