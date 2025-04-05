public class SecondHighestCGPA {

    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        double highest = Double.NEGATIVE_INFINITY;

        for (double cgpa : cgpas) {
            if (cgpa > highest) {
                highest = cgpa;
            }
        }
        double secondHighest = Double.NEGATIVE_INFINITY;
        for (double cgpa : cgpas) {
            if (cgpa > secondHighest && cgpa < highest) {
                secondHighest = cgpa;
            }
        }

        System.out.println("The second highest CGPA is: " + secondHighest);
    }

}
