package javaProgram;

public class duplicateElement {
	public static void main(String[] args) {

		String s[] = { "java", "selenium", "java", "python" };
		for (int i = 0; i < s.length; i++) {
			for(int j=i+1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					System.out.println("duplicate elemt is " + s[i]);

				}
			}
		}
	}
}
