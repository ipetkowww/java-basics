import java.util.Scanner;

public class Exercise03_DepositCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int depositLength = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());

        double sum = deposit + depositLength * ((deposit * (annualInterestRate / 100)) / 12);
        System.out.println(sum);
    }

}