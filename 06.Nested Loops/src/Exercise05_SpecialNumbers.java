import java.util.Scanner;

public class Exercise05_SpecialNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            int lastDigit = i % 10;
            int tensDigit = (i / 10) % 10;
            int hundredsDigit = (i / 100) % 10;
            int thousandsDigit = (i / 1000) % 10;

            if (lastDigit == 0 || tensDigit == 0 || hundredsDigit == 0) {
                continue;
            }
            if (inputNumber % lastDigit == 0 && inputNumber % tensDigit == 0) {
                if (inputNumber % hundredsDigit == 0 && inputNumber % thousandsDigit == 0) {
                    System.out.printf("%d ", i);
                }
            }
        }
    }

}
