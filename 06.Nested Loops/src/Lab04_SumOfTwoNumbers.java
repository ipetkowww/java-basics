import java.util.Scanner;

public class Lab04_SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int combination = 0;
        boolean foundCombination = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combination++;
                if (i + j == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)",
                            combination, i, j, i + j);
                    foundCombination = true;
                    break;
                }
            }
            if (foundCombination) {
                break;
            }
        }
        if (!foundCombination) {
            System.out.printf("%d combinations - neither equals %d", combination, magicNum);
        }
    }

}
