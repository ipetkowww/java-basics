import java.util.Scanner;

public class Exercise01_UsdToBgn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double oneUsdToBgn = 1.79549;
        double bgn = usd * oneUsdToBgn;
        System.out.println(bgn);
    }

}