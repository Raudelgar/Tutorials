package com.w3resource.methods;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;


public class MethodExercise1 {

	public static void main(String[] args) {
//		exercise1();
//		exercise1a();
//		exercise2();
//		exercise3();
//		exercise3a();
//		exercise4();
//		exercise5();
//		exercise6();
//		exercise7();
//		exercise8();
//		exercise10();
//		exercise11();
//		exercise12();
		exercise15();

		

	}
	
	private static void exercise1() {
		
		System.out.println("\nExercise1 : Write a Java method to find the smallest number among three numbers.");
		Scanner sc = new Scanner(System.in);
		TreeSet<BigDecimal> in = new TreeSet<>();
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter a number: ");
			in.add(sc.nextBigDecimal());
		}
		long start = System.currentTimeMillis();
		System.out.println("The smallest number is: "+in.first());
		System.out.println(System.currentTimeMillis() - start+"ms");
	}
	
	private static void exercise1a() {
		
		System.out.println("\nExercise1 : Write a Java method to find the smallest number among three numbers.");
		Scanner in = new Scanner(System.in);
		int count = 0;
		double x = 0;
		double y = 0;
		double z = 0;
		while(count < 3) {
			count ++;
			System.out.println("Enter a number: ");
			if(count == 1) {
				x = in.nextDouble();
			}else if(count == 2) {
				y = in.nextDouble();
			}else if(count == 3) {
				z = in.nextDouble();
			}
		}
		long start = System.currentTimeMillis();
		System.out.println("The smallest number is:"+Math.min(Math.min(x, y),z));
		System.out.println(System.currentTimeMillis() - start+"ms");
	}
	
	private static void exercise2() {
		//Write a Java method to compute the average of three numbers.
		System.out.println("\nExercise 2 : Write a Java method to compute the average of three numbers.");
		Scanner sc = new Scanner(System.in);
		int count = 0;
		double x = 0;
		double y = 0;
		double z = 0;
		while(count < 3) {
			count ++;
			System.out.println("Enter a number: ");
			if(count == 1) {
				x = sc.nextDouble();
			}else if(count == 2) {
				y = sc.nextDouble();
			}else if(count == 3) {
				z = sc.nextDouble();
			}
		}
		System.out.println("The average is: "+avergareThree(x, y, z));
	}

	private static double avergareThree(double x, double y, double z) {
		double result = ((x + y+ z)/3);
		return result;
	}
	
	private static void exercise3() {
		//Write a Java method to display the middle character of a string.
		System.out.println("\nExercise 3: Write a Java method to display the middle character of a string.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number or word:");
		String input = sc.nextLine();
		if(input.length()%2 == 0) {
			char inFirst = input.charAt(input.length()/2 -1);
			char inLast = input.charAt(input.length()/2);
			System.out.println("Result: "+inFirst+inLast);
		}else {
			System.out.println("Result: "+input.charAt(input.length()/2));
		}
	}
	
	private static void exercise3a() {
		//Write a Java method to display the middle character of a string.
		System.out.println("\nExercise 3a: Write a Java method to display the middle character of a string.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number or word:");
		String input = sc.nextLine();
		System.out.println("Result: "+middle(input)+"\n");		
	}

	private static String middle(String input) {
		int position;
		int lenght;
		if(input.length() % 2 == 0) {
			position = input.length()/2 -1;
			lenght = 2;
		} else {
			position = input.length()/2;
			lenght = 1;
		}
		return input.substring(position, position + lenght);
	}
	
	private static void exercise4() {
		//Write a Java method to count all vowels in a string.
		System.out.println("\nExercise 4: Write a Java method to count all vowels in a string.");
		System.out.println("Enter a word:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int count = 0;
		String[] ch = input.split("");
		for(int i = 0; i < ch.length; i++) {
			if(ch[i].equals("a") || ch[i].equals("e") || ch[i].equals("i")
					|| ch[i].equals("o") || ch[i].equals("u")) {
				count ++;
			}
		}
		System.out.println("The amount of vowels is: "+count);
	}
	
	private static void exercise5() {
		//Write a Java method to count all words in a string
		System.out.println("\nExercise 4: Write a Java method to count all vowels in a string.");
		System.out.println("Enter a sentence:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] word = input.split(" ");
		System.out.println("Result: "+word.length);
	}

	private static void exercise6() {
		//Write a Java method to compute the sum of the digits in an integer.
		System.out.println("\nExercise 6: Write a Java method to compute the sum of the digits in an integer.");
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("Result: "+digit(input));
	}

	private static int digit(int input) {
		int count = 0;
		while(input > 0) {
			count += input % 10;
			input /= 10;
		}
		return count;
	}
	
	private static void exercise7() {
		//Write a Java method to display the first 50 pentagonal numbers.
		System.out.println("\nExercise 7: Write a Java method to display the first 50 and 70 pentagonal numbers.");
		int count = 1;
		for(int i = 1; i <= 50; i++ ) {
			System.out.printf("%-6d",getPentagonalFifty(i));
			if(count == 10) {
				System.out.println("\n");
				count = 0;
			}count ++;
		}
	}
	private static int getPentagonalFifty(int i) {
		return (i *(3 * i -1))/2;
	}
	
	private static void exercise8() {
		//Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
		System.out.println("\nExercise 8: Write a Java method to compute the future investment value at a given interest rate for a specified number of years.");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of inventent:");
		double investment = sc.nextDouble();
		System.out.println("Enter the interest rate:");
		double rate = sc.nextDouble()/100; //Convert the rate into percentage
		double monthlyRate = rate/12; //Convert annual rate to monthly
		System.out.println("Enter the number of years:");
		int year = sc.nextInt();
		System.out.println("Year    Future_Amount");
		for(int i = 1; i <= year; i++) {
			System.out.printf(i+"%17.2f\n",futureAmount(investment,monthlyRate,i));
		}
	}

	private static double futureAmount(double investment, double monthlyRate, int i) {
		return investment * Math.pow((1 + monthlyRate), i*12);
	}
	
	private static void exercise10() {
		//Write a Java method to check whether a year (integer) entered by the user is a leap year or not. 
		System.out.println("\nExercise 10: Write a Java method to check whether a year (integer) entered by the user is a leap year or not.");
		System.out.println("Enter a year:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println("The "+year+" is a leap year: "+isLeapYear(year));
	}

	private static boolean isLeapYear(int year) {
		boolean result = false;
			if(year % 4 == 0 && ((year % 100 != 0) || (year % 100 == 0 && year % 400 == 0))) {
				result = true;
			}
		return result;
	}
	
	private static void exercise11() {
		/*Write a Java method to check whether a string is a valid password.
		 * Password rules:
			A password must have at least ten characters.
			A password consists of only letters and digits.
			A password must contain at least two digits.
		 */
		System.out.println("\nExercise 11: Write a Java method to check whether a string is a valid password.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password:"
				+"Password rules:"
			+"A password must have at least ten characters.\n"
			+"A password consists of only letters and digits.\n"
			+"A password must contain at least two digits.");
		String pwd = sc.nextLine();

		if(checkPassword(pwd)) {
			System.out.println("Congratulation your password has been saved!");
		} else {
			System.out.println("The password is too short or Invalid password, try again!");
		}
	}
	private static boolean checkPassword(String pwd) {
		int countDigit = 0;
		int countLetter = 0;
		boolean result = false;
		
		if(pwd.length() < 10) return  false;
		
		for(int i = 0; i < pwd.length(); i++) {
			char ch = pwd.charAt(i);
			if(hasLetter(ch)) 
				countLetter++;	
			if(hasDigit(ch))
				countDigit++;		
		}
		if(countDigit >= 2 && countLetter == pwd.length() - countDigit) {
			result = true;
		} 
		return result;
			
	}

	private static boolean hasDigit(char ch) {
		return (ch >='0' && ch <='9');
	}

	private static boolean hasLetter(char ch) {
		char lower_ch = Character.toLowerCase(ch);
		return (lower_ch >= 'a' && lower_ch <= 'z');		
	}
	
	private static void exercise12() {
		//Write a Java method (takes a number n as input) to displays an n-by-n matrix.
		System.out.println("\nExercise 12: Write a Java method (takes a number n as input) to displays an n-by-n matrix.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int input = sc.nextInt();
		matrixPrint(input);
	}

	private static void matrixPrint(int input) {
		for(int row = 0; row < input; row++) {
			for(int col = 0; col < input; col++) {
				System.out.print((int)(Math.random() * 2)+" ");
			}
			System.out.println();
		}
	}
	
	private static void exercise15() {
		//Write a Java method to display the current date and time.
		System.out.println("\nExercise 15: Write a Java method to display the current date and time.");
		Date date = new Date();
		System.out.printf("%s %tA %<tB %<te, %<tY %<tr %<tZ","Today is:",date);
	}
}
