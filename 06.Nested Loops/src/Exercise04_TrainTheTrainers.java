import java.util.Scanner;

public class Exercise04_TrainTheTrainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juryCount = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double grades = 0;
        double finalAssessment = 0;
        int gradesCount = 0;

        while (!"Finish".equals(presentation)) {
            for (int i = 0; i < juryCount; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                grades += currentGrade;
                finalAssessment += currentGrade;
                gradesCount++;
            }
            System.out.printf("%s - %.2f.%n", presentation, grades / juryCount);
            grades = 0;
            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", finalAssessment / gradesCount);
    }

}
