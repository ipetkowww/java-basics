import java.util.Scanner;

public class Lab09_YardGreening {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yardArea = Double.parseDouble(scanner.nextLine());
        double pricePerSquareMeter = 7.61;
        double discount = 0.18;

        double price = yardArea * pricePerSquareMeter;
        double priceWithDiscount = price * discount;
        double finalPrice = price - priceWithDiscount;

        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", priceWithDiscount);
    }

}
