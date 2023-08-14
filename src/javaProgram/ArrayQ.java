package javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayQ {
	
	public static void main(String[] args) {
		
		/*
		 * sort an Array using function?
		 * 
		 * int arr[]= {1,2,3,4,5,6,7,22,11,1,21,43};
		int temp;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(" ,"+arr[i]);
		}*/
		
		String[] myArray = {"element1", "element2", "element3"};
		List<String> myList = new ArrayList<>(Arrays.asList(myArray));
		System.out.println(myList);
		
	}

}
