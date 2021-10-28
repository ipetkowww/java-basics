import java.util.Scanner;

public class Exercise03_NewHouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double rosePrice = 5;
        double dahliaPrice = 3.8;
        double tulipPrice = 2.8;
        double narcissusPrice = 3;
        double gladiolusPrice = 2.5;
        double totalPrice = 0;

        switch (flowers) {
            case "Roses":
                totalPrice = flowersCount * rosePrice;
                if (flowersCount > 80) {
                    totalPrice -= (totalPrice * 0.1);
                }
                break;
            case "Dahlias":
                totalPrice = flowersCount * dahliaPrice;
                if (flowersCount > 90) {
                    totalPrice -= (totalPrice * 0.15);
                }
                break;
            case "Tulips":
                totalPrice = flowersCount * tulipPrice;
                if (flowersCount > 80) {
                    totalPrice -= (totalPrice * 0.15);
                }
                break;
            case "Narcissus":
                totalPrice = flowersCount * narcissusPrice;
                if (flowersCount < 120) {
                    totalPrice += (totalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                totalPrice = flowersCount * gladiolusPrice;
                if (flowersCount < 80) {
                    totalPrice += (totalPrice * 0.2);
                }
                break;
        }
        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowers, budget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }

}