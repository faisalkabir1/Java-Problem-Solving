import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        String result = input.replaceAll("[AEIOUaeiou]", "");
        System.out.println("String after removing vowels: " + result);
    }
}
