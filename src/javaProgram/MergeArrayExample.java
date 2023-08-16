package javaProgram;

import java.util.Arrays;

public class MergeArrayExample {
	public static void main(String[] args) {
		int firstarray[]= {1,2,3,4};
		int secondArray[]= {2,4,5,6,7};
		
		int fa= firstarray.length;
		int  sa=secondArray.length;
		
		int res[]= new int[fa+sa]; 
		System.arraycopy(firstarray, 0, res, 0, fa);
		System.arraycopy(secondArray, 0, res, fa, sa);
		System.out.println(Arrays.toString(res));
		}

}
