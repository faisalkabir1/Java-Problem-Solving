import java.util.Random;

public class PasswordGenerator {

    public static String generatePassword() {
        Random random = new Random();

        // Define character sets
        String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smalls = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specials = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        String allChars = capitals + smalls + digits + specials;

        // Ensure at least one of each required type
        StringBuilder password = new StringBuilder();
        password.append(capitals.charAt(random.nextInt(capitals.length())));
        password.append(smalls.charAt(random.nextInt(smalls.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specials.charAt(random.nextInt(specials.length())));

        // Fill the remaining 4 characters with random char
        for (int i = 0; i < 4; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        // Shuffle the password to make it random
        char[] passwordArray = password.toString().toCharArray();
        for (int i = passwordArray.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap char
            char temp = passwordArray[i];
            passwordArray[i] = passwordArray[j];
            passwordArray[j] = temp;
        }

        return new String(passwordArray);
    }

    public static void main(String[] args) {

        String password = generatePassword();
        System.out.println("Generated Password: " + password);
    }
}