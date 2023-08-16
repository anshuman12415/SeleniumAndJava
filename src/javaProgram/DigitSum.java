package javaProgram;

import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		/*
		 * int number = 12345; // Replace with the desired number
		 * 
		 * //int digitSum=calculateDigitSum(number); int digitSum =
		 * calculateDigitSum(number);
		 * 
		 * System.out.println("Sum of digits in " + number + " is: " + digitSum); }
		 * 
		 * public static int calculateDigitSum(int num) { int sum = 0;
		 * 
		 * // Convert the number to a string String numStr = String.valueOf(num);
		 * 
		 * // Iterate through the characters and sum up the digits for (char digitChar :
		 * numStr.toCharArray()) { int digit = Character.getNumericValue(digitChar); sum
		 * += digit; }
		 * 
		 * return sum;
		 */

		/*
		 * long number, sum; Scanner sc=new Scanner(System.in);
		 * System.out.print("Enter a number: "); //reads a long number from the user
		 * number=sc.nextLong(); //executes until the condition number!=0 becomes false
		 * for(sum=0; number!=0; number=number/10) { //finds the last digit and add it
		 * to the variable sum sum = sum + number % 10; } //prints the result
		 * System.out.println("Sum of digits: "+sum);
		 */
		long number,sum;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		number=sc.nextLong();
		for(sum=0;number!=0;number=number/10) {
			sum=sum+number%10;
		}System.out.println("sum of number is : "+sum);
	}

}
