import java.util.Scanner;
public class BinarySearchCGPA {

    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for (int i = 0; i < cgpas.length - 1; i++) {
            for (int j = i + 1; j < cgpas.length; j++) {
                if (cgpas[i] > cgpas[j]) {
                    double temp = cgpas[i];
                    cgpas[i] = cgpas[j];
                    cgpas[j] = temp;
                }
            }
        }


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CGPA to search: ");
        double target = sc.nextDouble();
        sc.close();


        boolean found = binarySearch(cgpas, target);


        if (found) {
            System.out.println("CGPA " + target + " is present in the list.");
        } else {
            System.out.println("CGPA " + target + " is NOT present in the list.");
        }
    }


    public static boolean binarySearch(double[] arr, double key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return true;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

}
