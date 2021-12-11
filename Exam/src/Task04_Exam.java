import java.util.Scanner;

public class Task04_Exam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double group1 = 0;
        double group2 = 0;
        double group3 = 0;
        double group4 = 0;
        double allGrades = 0;

        for (int i = 1; i <= studentsCount; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 2.00 && grade <= 2.99) {
                group4++;
            } else if (grade >= 3.00 && grade <= 3.99) {
                group3++;
            } else if (grade >= 4.00 && grade <= 4.99) {
                group2++;
            } else {
                group1++;
            }
            allGrades += grade;
        }
        System.out.printf("Top students: %.2f%%%n", (group1 / studentsCount) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (group2 / studentsCount) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (group3 / studentsCount) * 100);
        System.out.printf("Fail: %.2f%%%n", (group4 / studentsCount) * 100);
        System.out.printf("Average: %.2f", allGrades / studentsCount);
    }
}
