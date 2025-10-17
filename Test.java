package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * int a = 10, b = 20, c = 30; String d = "codegnan"; System.out.println(a + b +
		 * c + d);//60codegnan System.out.println(b + c + d + a);//50codegnan10
		 * System.out.println(c + d + a + b);//30codegnan1020 System.out.println(d + a +
		 * b + c);//codegnan102030
		 */

		/*
		 * System.out.println((10<20)&&true); System.out.println(10|2);
		 * System.out.println(10^2);
		 */

		int i, k;
		i = 10;
		k = i < 0 ? -i : i;//10
		System.out.println("absolute value of " + i + " is " + k);
		i = -10;
		k = i < 0 ? -i : i;//
		System.out.println("absolute value of " + i + " is " + k);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the age ");
		int age=scanner.nextInt();
		//syntax (condition)?exp1:exp2;
		String result=(age>18)?"Eligible to vote":"not eligible to vote";
		System.out.println(result);
		scanner.close();
	}
// even or odd
//leap year or not leap year.
// number is positive or not.
// number is divisible by 5 or not.

}
