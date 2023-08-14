package javaProgram;

public class MISC1 {
    public static void main(String[] args) {
        String s = "anshuman";
        String result = extractVowels(s);
        System.out.println("String with vowels: " + result);
    }

    public static String extractVowels(String input) {
        StringBuilder result = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                result.append(c);
            }
        }
        
        return result.toString();
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Convert to lowercase to handle both cases
        
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
