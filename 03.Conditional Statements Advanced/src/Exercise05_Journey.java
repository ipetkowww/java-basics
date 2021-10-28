import java.util.Scanner;

public class Exercise05_Journey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = season.equals("summer") ? "Camp" : "Hotel";
        String destination;
        double spendMoney;

        if (budget <= 100) {
            destination = "Bulgaria";
            spendMoney = season.equals("summer") ? budget * 0.3 : budget * 0.7;
        } else if (budget <= 1000) {
            destination = "Balkans";
            spendMoney = season.equals("summer") ? budget * 0.4 : budget * 0.8;
        } else {
            destination = "Europe";
            spendMoney = budget * 0.9;
            place = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, spendMoney);
    }

}
