package javaProgram;

import java.util.Arrays;
import java.util.Collections;

public class MaxNum {
	public static void main(String[] args) {
		Integer[] a = { 9, 3, 6, 44, 8, 5 };
		// int max = Collections.max(Arrays.asList(a));
		// System.out.println(max);

		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}
		}
		System.out.println(max);
	}
}
