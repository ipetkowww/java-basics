import java.util.Scanner;

public class Exercise04_CleverLily {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toyCount = 0;
        int money = 10;
        int savedMoney = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 1) {
                toyCount++;
            } else {
                savedMoney += money;
                money += 10;
                savedMoney--;
            }

        }
        int sellToys = toyCount * toyPrice;
        int totalSavedMoney = savedMoney + sellToys;

        if (totalSavedMoney >= laundryPrice) {
            System.out.printf("Yes! %.2f", totalSavedMoney - laundryPrice);
        } else {
            System.out.printf("No! %.2f", laundryPrice - totalSavedMoney);
        }
    }

}
