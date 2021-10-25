import java.util.Scanner;

public class Lab06_NumberInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean isInRange = number >= -100 && number <= 100;
        boolean isDifferentFromZero = number != 0;

        if (isInRange && isDifferentFromZero) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}