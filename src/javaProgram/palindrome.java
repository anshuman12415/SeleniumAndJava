package javaProgram;

public class palindrome {
	public static void main(String[] args) {
		String chr = "mom", rev = "";
		int len = chr.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + chr.charAt(i);
		}
		if (chr.equals(rev)) {
			System.out.println(" String is Palindrome -->: " + chr);
		} else {
			System.out.println(" given string is not palindrome -->:"+chr);
		}
	}
}