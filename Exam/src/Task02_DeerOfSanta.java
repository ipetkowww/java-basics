import java.util.Scanner;

public class Task02_DeerOfSanta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int foodKG = Integer.parseInt(scanner.nextLine());
        double firstDeerFood = Double.parseDouble(scanner.nextLine());
        double secondDeerFood = Double.parseDouble(scanner.nextLine());
        double thirdDeerFood = Double.parseDouble(scanner.nextLine());

        double firstDeerNeedFood = days * firstDeerFood;
        double secondDeerNeedFood = days * secondDeerFood;
        double thirdDeerNeedFood = days * thirdDeerFood;
        double totalFood = firstDeerNeedFood + secondDeerNeedFood + thirdDeerNeedFood;

        if (totalFood <= foodKG) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodKG - totalFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFood - foodKG));
        }
    }
}
