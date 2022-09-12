package com.kanerika.test.util;

import java.util.Scanner;

public class Array {
	public static void multiply(int[] a) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter input2:");
		int n = s.nextInt();
		int count = 0;
		if (n < 1) {
			System.out.println("wrong input");
		} else {
			for (int i = 0; i < a.length - 1; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] * a[j] == n) {
						System.out.println(i + " " + j);
						count++;
					}
				}
			}
			if (count == 0) {
				System.out.println("there are no elements that give " + n + " when we multiply two numbers");
			}
		}
		s.close();
	}

}
