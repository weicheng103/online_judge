package syntaxPractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class A263 {
	// a263: 日期差幾天
	public static void main(String[] args) throws ParseException{
		Scanner scanner = new Scanner(System.in);
		String d1 = scanner.next();
		String d2 = scanner.next();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		format.setLenient(false);
		
		Date date1 = format.parse(d1);
		Date date2 = format.parse(d2);
		
		long days = (date2.getTime()-date1.getTime())/(1000*60*60*24);
		
		System.out.println(days);
	}
}
