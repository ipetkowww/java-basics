import java.util.Scanner;

public class Exercise05_GodzillaVsKong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;
        double clothesPrice = statists * clothes;
        if (statists > 150) {
            clothesPrice -= (clothesPrice * 0.1);
        }
        double totalPrice = decorPrice + clothesPrice;

        if (totalPrice <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalPrice);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalPrice - budget);
        }
    }

}