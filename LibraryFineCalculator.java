package com.codegnan.operatorexamples;

import java.util.Scanner;

public class LibraryFineCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read N and Q
		int N = sc.nextInt();
		int Q = sc.nextInt();

		int[] fines = new int[N];
		for (int i = 0; i < N; i++) {
			fines[i] = sc.nextInt();
		}

		// Process each query
		for (int i = 0; i < Q; i++) {
			int L = sc.nextInt();
			int R = sc.nextInt();
			int T = sc.nextInt();

			int sum = 0;
			for (int j = L - 1; j < R; j++) {
				sum += fines[j];
			}

			// Cap at threshold if exceeded
			if (sum > T) {
				sum = T;
			}

			System.out.println(sum);
		}

		sc.close();
	}
}
