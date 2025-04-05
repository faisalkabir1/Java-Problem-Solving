public class QuestionPaperSolver {

    public static void main(String[] args) {
        int totalQuestions = 15;
        int totalMarks = 100;

        boolean found = false;

        for (int x = 0; x <= totalQuestions; x++) {
            int y = totalQuestions - x;

            int marks = (5 * x) + (10 * y);

            if (marks == totalMarks) {
                System.out.println("5 mark questions is " + x);
                System.out.println("10 mark questions is " + y);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No valid combination of 5-mark and 10-mark questions adds up to 100 marks with 15 questions.");
        }
    }
}

