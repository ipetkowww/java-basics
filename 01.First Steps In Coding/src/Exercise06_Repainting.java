import java.util.Scanner;

public class Exercise06_Repainting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plastic = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double plasticPrice = (plastic + 2) * 1.50;
        double paintPrice = (paint + (paint * 0.1)) * 14.50;
        double thinnerPrice = thinner * 5;
        double bagsPrice = 0.4;
        double allMaterialsPrice = plasticPrice + paintPrice + thinnerPrice + bagsPrice;
        double priceForMaster = allMaterialsPrice * 0.3 * hours;
        double totalPrice = allMaterialsPrice + priceForMaster;
        System.out.println(totalPrice);
    }

}