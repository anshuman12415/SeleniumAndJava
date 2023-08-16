package javaProgram;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayConversion {
	public static void main(String[] args) {
		String arr[] = { "a", "N", "s", "h" }; // o/p should be aNsh
		String join = String.join("", arr);
		System.out.println(join);

		// or, use stream
		String join1 = Arrays.asList(arr).stream().collect(Collectors.joining(""));
		System.out.println(join1);
		
		//or use stringbuilder
		 
	}

}
