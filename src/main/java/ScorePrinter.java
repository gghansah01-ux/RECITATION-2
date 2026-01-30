public class ScorePrinter {

    /*
     * Prints a weighted score summary.
     *
     * Output must look like:
     * Homework Score and Exam Score: <homeworkScore> <examScore>
     * Homework Weight and Exam Weight: <homeworkWeight> <examWeight>
     * Homework contribution: <homeworkPart>
     * Exam contribution: <examPart>
     */
    public static void printWeightedScore(
            int homeworkScore,
            int examScore,
            int homeworkWeight,
            int examWeight) {

        int totalWeight = homeworkWeight + examWeight;
        System.out.println(
                "Homework Score and Exam Score: "
                + homeworkScore + " " + examScore
        );

        System.out.println(
                "Homework Weight and Exam Weight: "
                + homeworkWeight + " " + examWeight
        );



        double homeworkPart =
                (double) homeworkScore * homeworkWeight / totalWeight;

        double examPart =
                (double) examScore * examWeight / totalWeight;

        System.out.println("Homework contribution: " + homeworkPart);
        System.out.println("Exam contribution: " + examPart);

        // TODO 3:
        System.out.println(
                "Final score: " + (homeworkPart + examPart)
        );
    }
}

