import java.util.Scanner;

public class Exercise08_BasketballEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualPrice = Integer.parseInt(scanner.nextLine());

        double shoesPrice = annualPrice - (annualPrice * 0.4);
        double equipPrice = shoesPrice - (shoesPrice * 0.2);
        double ballPrice = equipPrice / 4;
        double accessoriesPrice = ballPrice / 5;
        double totalPrice = annualPrice + shoesPrice + equipPrice + ballPrice + accessoriesPrice;
        System.out.println(totalPrice);
    }

}