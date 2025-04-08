public class SortCGPA {
    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};


        for (int i = 0; i < cgpas.length - 1; i++) {
            for (int j = i + 1; j < cgpas.length; j++) {
                if (cgpas[i] < cgpas[j]) {
                    double temp = cgpas[i];
                    cgpas[i]=cgpas[j];
                    cgpas[j]=temp;
                }
            }
        }


        System.out.println("CGPAs sorted in descending order:");
        for (double cgpa : cgpas) {
            System.out.print(cgpa + " ");
        }
    }
}
