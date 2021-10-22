import java.util.Scanner;

public class Exercise05_SuppliesForSchool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPenPackages = Integer.parseInt(scanner.nextLine());
        int countMarkersPackages = Integer.parseInt(scanner.nextLine());
        int litersLiquidForDashboard = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double penPackagesPrice = countPenPackages * 5.8;
        double markersPackagesPrice = countMarkersPackages * 7.2;
        double liquidPrice = litersLiquidForDashboard * 1.20;
        double allMaterialsPrice = penPackagesPrice + markersPackagesPrice + liquidPrice;
        double priceDiscount = allMaterialsPrice - (allMaterialsPrice * (discountPercent * 1.0 / 100));
        System.out.println(priceDiscount);
    }

}