import java.util.Scanner;

public class Exercise04_ToyShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int speakingDollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = puzzlesCount * 2.60;
        double speakingDollPrice = speakingDollsCount * 3;
        double bearsPrice = bearsCount * 4.1;
        double minionsPrice = minionsCount * 8.2;
        double trucksPrice = trucksCount * 2;

        double sum = puzzlePrice + speakingDollPrice + bearsPrice + minionsPrice + trucksPrice;
        int toysCount = puzzlesCount + speakingDollsCount + bearsCount + minionsCount + trucksCount;

        if (toysCount >= 50) {
            sum -= (sum * 0.25);
        }
        sum -= (sum * 0.1);

        if (sum >= vacationPrice) {
            System.out.printf("Yes! %.2f lv left.", sum - vacationPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", vacationPrice - sum);
        }
    }

}