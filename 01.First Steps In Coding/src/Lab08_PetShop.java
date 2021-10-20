import java.util.Scanner;

public class Lab08_PetShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFoodPackages = Integer.parseInt(scanner.nextLine());
        int catFoodPackages = Integer.parseInt(scanner.nextLine());

        double priceDogFood = 2.50;
        double priceCatFood = 4;

        System.out.printf("%.1f lv.", dogFoodPackages * priceDogFood + catFoodPackages * priceCatFood);
    }

}