import java.util.Scanner;

public class Exercise03_Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int spendDays = 0;
        int days = 0;

        while (true) {
            String action = scanner.nextLine();
            double amountOfMoney = Double.parseDouble(scanner.nextLine());
            days++;

            switch (action) {
                case "spend":
                    money -= amountOfMoney;
                    if (money <= 0) {
                        money = 0;
                    }
                    spendDays++;
                    if (spendDays == 5) {
                        System.out.printf("You can't save the money.%n");
                        System.out.println(days);
                        return;
                    }
                    break;
                case "save":
                    spendDays = 0;
                    money += amountOfMoney;
                    if (money >= neededMoney) {
                        System.out.printf("You saved the money for %d days.%n", days);
                        return;
                    }
                    break;
            }
        }
    }

}
