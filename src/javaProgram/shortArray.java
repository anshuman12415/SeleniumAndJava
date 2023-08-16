package javaProgram;

import java.util.Arrays;

public class shortArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 11, 21, 6, 11, 23, 44, 55 };
		Arrays.sort(a);
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.print(" "+a[i]);
		}
	}

}
