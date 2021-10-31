import java.util.Scanner;

public class Lab08_Graduation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        int studentClass = 1;
        double allGrades = 0;
        int studentFail = 0;

        while (true) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                allGrades += grade;
                if (studentClass == 12 ) {
                    System.out.printf("%s graduated. Average grade: %.2f", studentName, allGrades / 12);
                    break;
                }
                studentClass++;
            } else {
                studentFail++;
                if (studentFail > 1) {
                    System.out.printf("%s has been excluded at %d grade%n", studentName, studentClass);
                    break;
                }
            }

        }
    }

}
