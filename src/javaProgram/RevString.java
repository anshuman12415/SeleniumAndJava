package javaProgram;

public class RevString {
	public static void main(String[] args) {
		String S = "My Name Is Anshuman";

		StringBuilder sb = new StringBuilder(S);
		sb.reverse().toString();

		System.out.println(sb);
	}

}
