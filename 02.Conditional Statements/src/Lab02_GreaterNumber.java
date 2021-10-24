import java.util.Scanner;

public class Lab02_GreaterNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(firstNumber > secondNumber ? firstNumber : secondNumber); // solution #1
        // System.out.println(Math.max(firstNumber, secondNumber)); // solution #2
    }

}