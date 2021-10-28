import java.util.Scanner;

public class Exercise09_SkiTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysForStay = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedback = scanner.nextLine();
        int nights = daysForStay - 1;

        double price = 0;

        switch (roomType) {
            case "room for one person":
                price = 18 * nights;
                break;
            case "apartment":
                price = 25 * nights;
                if (nights < 10) {
                    price -= price * 0.3;
                } else if (nights <= 15) {
                    price -= price * 0.35;
                } else {
                    price -= price * 0.5;
                }
                break;
            case "president apartment":
                price = 35 * nights;
                if (nights < 10) {
                    price -= price * 0.1;
                } else if (nights <= 15) {
                    price -= price * 0.15;
                } else {
                    price -= price * 0.2;
                }
                break;
        }
        if (feedback.equals("positive")) {
            price += price * 0.25;
        } else {
            price -= price * 0.1;
        }
        System.out.printf("%.2f", price);
    }

}
