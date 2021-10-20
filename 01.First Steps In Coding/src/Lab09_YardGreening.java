import java.util.Scanner;

public class Lab09_YardGreening {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        double priceForYard = price * 7.61;
        double discount = priceForYard * 0.18;
        double finalPrice = priceForYard - discount;

        System.out.printf("The final price is: %.2f lv.%nThe discount is: %.2f lv.", finalPrice, discount);
    }

}
