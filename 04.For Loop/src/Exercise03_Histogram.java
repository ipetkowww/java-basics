import java.util.Scanner;

public class Exercise03_Histogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1Numbers = 0;
        int p2Numbers = 0;
        int p3Numbers = 0;
        int p4Numbers = 0;
        int p5Numbers = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                p1Numbers++;
            } else if (number <= 399) {
                p2Numbers++;
            } else if (number <= 599) {
                p3Numbers++;
            } else if (number <= 799) {
                p4Numbers++;
            } else {
                p5Numbers++;
            }
        }
        System.out.printf("%.2f%%%n", (p1Numbers * 1.0 / n) * 100);
        System.out.printf("%.2f%%%n", (p2Numbers * 1.0 / n) * 100);
        System.out.printf("%.2f%%%n", (p3Numbers * 1.0 / n) * 100);
        System.out.printf("%.2f%%%n", (p4Numbers * 1.0 / n) * 100);
        System.out.printf("%.2f%%", (p5Numbers * 1.0 / n) * 100);
    }

}
