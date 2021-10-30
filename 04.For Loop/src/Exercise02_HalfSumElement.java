import java.util.Scanner;

public class Exercise02_HalfSumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sumNumbers = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number >= maxNumber) {
                maxNumber = number;
            }
            sumNumbers += number;
        }
        int sumWithoutMax = Math.abs(maxNumber - sumNumbers);

        if (maxNumber == sumWithoutMax) {
            System.out.printf("Yes%nSum = %d", sumWithoutMax);
        } else {
            int diff = Math.abs(maxNumber - sumWithoutMax);
            System.out.printf("No%nDiff = %d", diff);
        }
    }

}
