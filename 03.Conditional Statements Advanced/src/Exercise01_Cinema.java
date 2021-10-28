import java.util.Scanner;

public class Exercise01_Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        double premiereProjectionPrice = 12;
        double normalProjectionPrice = 7.50;
        double discountProjectionPrice = 5;
        double allSeats = rows * cols;
        double price = 0;

        switch (type) {
            case "Premiere":
                price = allSeats * premiereProjectionPrice;
                break;
            case "Normal":
                price = allSeats * normalProjectionPrice;
                break;
            case "Discount":
                price = allSeats * discountProjectionPrice;
                break;
        }
        System.out.printf("%.2f", price);
    }

}