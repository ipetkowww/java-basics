import java.util.Scanner;

public class Task03_CourierExpress {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deliveryWeight = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int distanceKM = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double totalPrice = 0;

        if (deliveryWeight < 1) {
            price = 0.03;
        } else if (deliveryWeight >= 1 && deliveryWeight < 10) {
            price = 0.05;
        } else if (deliveryWeight >= 10 && deliveryWeight < 40) {
            price = 0.10;
        } else if (deliveryWeight >= 40 && deliveryWeight < 90) {
            price = 0.15;
        } else if (deliveryWeight >= 90 && deliveryWeight < 150) {
            price = 0.20;
        }

        switch (type) {
            case "standard":
                totalPrice = price * distanceKM;
                break;
            case "express":
                totalPrice = price * distanceKM;
                if (deliveryWeight < 1) {
                    totalPrice += (((price * 80) / 100) * deliveryWeight) * distanceKM;
                } else if (deliveryWeight >= 1 && deliveryWeight < 10) {
                    totalPrice += (((price * 40) / 100) * deliveryWeight) * distanceKM;
                } else if (deliveryWeight >= 10 && deliveryWeight < 40) {
                    totalPrice += (((price * 5) / 100) * deliveryWeight) * distanceKM;
                } else if (deliveryWeight >= 40 && deliveryWeight < 90) {
                    totalPrice += (((price * 2) / 100) * deliveryWeight) * distanceKM;
                } else if (deliveryWeight >= 90 && deliveryWeight < 150) {
                    totalPrice += (((price * 1) / 100) * deliveryWeight) * distanceKM;
                }
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", deliveryWeight, totalPrice);
    }
}
