import java.util.Scanner;

public class BinaryStringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        boolean isBinary = true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != '0' && c != '1') {
                isBinary = false;
                break;
            }
        }

        if (isBinary) {
            System.out.println("True: The string is binary.");
        } else {
            System.out.println("False: The string is not binary.");
        }
    }
}
