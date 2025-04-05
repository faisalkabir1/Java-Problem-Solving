import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = "I am a SQA Engineer"; //sc.nextLine();
        //sc.close();

        int wordCount = 0;
        int charCountWithoutSpaces = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        input = input.toLowerCase();
        String[] words = input.split("\\s+");
        wordCount = words.length;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                continue;
            }
            charCountWithoutSpaces++;
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            } else if ((c >= 'a' && c <= 'z')) {
                consonantCount++;
            }
        }

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters without spaces: " + charCountWithoutSpaces);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}

