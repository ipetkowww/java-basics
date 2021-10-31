import java.util.Scanner;

public class Exercise02_EqualSumsEvenOddPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());


        for (int i = start; i <= end; i++) {
            String currentNumber = "" + i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 0; j < currentNumber.length(); j++) {
                if (j % 2 == 0) {
                    evenSum += Character.getNumericValue(currentNumber.charAt(j));
                } else {
                    oddSum += Character.getNumericValue(currentNumber.charAt(j));
                }
            }
            if (evenSum == oddSum) {
                System.out.printf("%s ", currentNumber);
            }
        }
    }

}
