import java.util.Random;

public class RandomArrayMinMax {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(200) + 1;
        }


        System.out.println("Generated Random Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();


        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }


        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
