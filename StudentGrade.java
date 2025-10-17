package com.codegnan.operatorexamples;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = scanner.nextInt();

		char grade=(marks)>=90?'a':
			                 (marks>=80)?'b':
			                	 (marks>=70)?'c':
			                		 (marks>60)?'d':
			                			 (marks>=50)?'e':
			                				 'f';
		System.out.println("student Grade is "+grade);
		scanner.close();
	}

}
