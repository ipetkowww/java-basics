import java.util.Scanner;

public class Exercise04_FishingBoat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        switch (season) {
            case "Spring":
                totalPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                totalPrice = 4200;
                break;
            case "Winter":
                totalPrice = 2600;
                break;
        }
        if (peopleCount <= 6) {
            totalPrice -= totalPrice * 0.1;
        } else if (peopleCount <= 11) {
            totalPrice -= totalPrice * 0.15;
        } else {
            totalPrice -= totalPrice * 0.25;
        }
        if (peopleCount % 2 == 0 && !season.equals("Autumn")) {
            totalPrice -= totalPrice * 0.05;
        }

        if (budget >= totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalPrice - budget);
        }
    }

}
