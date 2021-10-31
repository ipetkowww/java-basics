import java.util.Scanner;

public class Lab05_AccountBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double accountBalance = 0;

        while (!"NoMoreMoney".equals(command)) {
            double money = Double.parseDouble(command);
            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            accountBalance += money;
            System.out.printf("Increase: %.2f%n", money);

            command = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", accountBalance);
    }

}
