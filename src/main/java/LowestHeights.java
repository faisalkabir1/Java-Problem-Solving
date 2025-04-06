import java.util.Scanner;

public class LowestHeights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[10];
        System.out.println("Enter the heights of 10 babies in cm:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
        }
        sc.close();
    double lowest = Double.MAX_VALUE;
        double secondLowest = Double.MAX_VALUE;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] < lowest) {
                secondLowest = lowest;
                lowest = heights[i];
            } else if (heights[i] < secondLowest && heights[i] != lowest) {
                secondLowest = heights[i];
            }
        }

        System.out.println("The two lowest heights are: ");
        System.out.println("Lowest height: " + lowest + " cm");
        System.out.println("Second lowest height: " + secondLowest + " cm");
    }
}

