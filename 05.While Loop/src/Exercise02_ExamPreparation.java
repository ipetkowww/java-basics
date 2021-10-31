import java.util.Scanner;

public class Exercise02_ExamPreparation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int failMarksCount = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int failMarks = 0;
        int allGrades = 0;
        int taskCount = 0;
        String lastTaskName = "";
        boolean isFail = false;

        while (!"Enough".equals(command)) {
            String taskName = command;
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                failMarks++;
                if (failMarks >= failMarksCount) {
                    System.out.printf("You need a break, %d poor grades.", failMarks);
                    isFail = true;
                    break;
                }
            }
            lastTaskName = taskName;
            taskCount++;
            allGrades += grade;
            command = scanner.nextLine();
        }
        if (!isFail) {
            System.out.printf("Average score: %.2f%n", allGrades * 1.0 / taskCount);
            System.out.printf("Number of problems: %d%n", taskCount);
            System.out.printf("Last problem: %s", lastTaskName);
        }
    }

}
