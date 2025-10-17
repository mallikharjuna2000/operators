package com.codegnan.operatorexamples;

import java.util.Scanner;

public class ParkingCharge {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the hours to park an vechile(24 hts-format)");
		int hours=scanner.nextInt();
		int fee=(hours<=3)?(hours*2):(3*2+(hours-3)*1);
		System.out.println(fee);
		scanner.close();
		

	}

}
