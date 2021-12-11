import java.util.Scanner;

public class Task01_CatDiet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatPercent = Integer.parseInt(scanner.nextLine());
        int proteinPercent = Integer.parseInt(scanner.nextLine());
        int carbsPercent = Integer.parseInt(scanner.nextLine());
        int totalCalories = Integer.parseInt(scanner.nextLine());
        int waterPercent = Integer.parseInt(scanner.nextLine());

        double fatGrams = ((totalCalories * fatPercent) / 100.0) / 9.0;
        double proteinGrams = ((totalCalories * proteinPercent) / 100.0) / 4.0;
        double carbsGrams = ((totalCalories * carbsPercent) / 100.0) / 4.0;
        double foodWeight = fatGrams + proteinGrams + carbsGrams;
        double caloriesPerGramFood = totalCalories / foodWeight;
        int water = 100 - waterPercent;
        double result = (caloriesPerGramFood * water) / 100;

        System.out.printf("%.4f", result);
    }
}
