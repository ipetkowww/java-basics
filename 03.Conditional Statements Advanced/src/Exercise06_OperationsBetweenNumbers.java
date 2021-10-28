import java.util.Scanner;

public class Exercise06_OperationsBetweenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int result;
        String evenOrOdd;

        switch (operator) {
            case "+":
                result = firstNum + secondNum;
                evenOrOdd = result % 2 == 0 ? "even" : "odd";
                System.out.printf("%d + %d = %d - %s", firstNum, secondNum, result, evenOrOdd);
                break;
            case "-":
                result = firstNum - secondNum;
                evenOrOdd = result % 2 == 0 ? "even" : "odd";
                System.out.printf("%d - %d = %d - %s", firstNum, secondNum, result, evenOrOdd);
                break;
            case "*":
                result = firstNum * secondNum;
                evenOrOdd = result % 2 == 0 ? "even" : "odd";
                System.out.printf("%d * %d = %d - %s", firstNum, secondNum, result, evenOrOdd);
                break;
            case "/":
            case "%":
                if (secondNum == 0) {
                    System.out.printf("Cannot divide %s by zero", firstNum);
                } else {
                    if (operator.equals("/")) {
                        double res = firstNum * 1.0 / secondNum;
                        System.out.printf("%d / %d = %.2f", firstNum, secondNum, res);
                    } else {
                        result = firstNum % secondNum;
                        System.out.printf("%d %% %d = %d", firstNum, secondNum, result);
                    }
                }
                break;
        }
    }

}
