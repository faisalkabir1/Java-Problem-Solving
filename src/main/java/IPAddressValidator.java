import java.util.Scanner;

public class IPAddressValidator {

    public static boolean isValidIPAddress(String ip) {

        String[] parts = ip.split("\\.");


        if (parts.length != 4) {
            return false;
        }

        for (int i = 0; i < 4; i++) {
            String part = parts[i];


            if (!part.matches("\\d+")) {
                return false;
            }

            int num = Integer.parseInt(part);


            if (num < 0 || num > 255) {
                return false;
            }


            if (i == 0) {

                if (num == 0 || part.length() == 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an IP address: ");
        String inputIP = scanner.nextLine();

        if (isValidIPAddress(inputIP)) {
            System.out.println(inputIP + " is a Valid IP address.");
        } else {
            System.out.println(inputIP + " is an Invalid IP address.");
        }

        scanner.close();
    }
}

