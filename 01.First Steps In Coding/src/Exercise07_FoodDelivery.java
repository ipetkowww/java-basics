import java.util.Scanner;

public class Exercise07_FoodDelivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenuCount = Integer.parseInt(scanner.nextLine());
        int fishMenuCount = Integer.parseInt(scanner.nextLine());
        int vegetarianMenuCount = Integer.parseInt(scanner.nextLine());

        double chickenMenu = 10.35;
        double fishMenu = 12.40;
        double vegetarianMenu = 8.15;
        double deliveryPrice = 2.50;

        double chickenMenuPrice = chickenMenuCount * chickenMenu;
        double fishMenuPrice = fishMenuCount * fishMenu;
        double vegetarianMenuPrice = vegetarianMenuCount * vegetarianMenu;
        double allMenusPrice = chickenMenuPrice + fishMenuPrice + vegetarianMenuPrice;
        double desertPrice = allMenusPrice * 0.2;
        double totalPrice = allMenusPrice + desertPrice + deliveryPrice;

        System.out.println(totalPrice);
    }

}