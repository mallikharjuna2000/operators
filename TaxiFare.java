package com.codegnan.operatorexamples;

import java.util.Scanner;

public class TaxiFare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Distance");
		int distance = scanner.nextInt();
		double fare = (distance <= 2) ? 50
				// first 2 kms 50 and next 8 kms are 8*15
				: (distance <= 10) ? (50 + (distance - 2) * 15) :
					// first 2=50+next 8*15+above 10*10
					(50 + (8 * 15) + (distance - 10) * 10);
		fare = (distance > 20) ? fare * 0.95 : fare;
		System.out.println(fare);
	}

}
