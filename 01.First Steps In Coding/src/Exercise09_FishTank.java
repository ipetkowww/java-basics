import java.util.Scanner;

public class Exercise09_FishTank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int fishTankVolume = length * width * height;
        double volumeInLiters = fishTankVolume * 0.001;
        double neededLiters = volumeInLiters * (1 - (percent / 100));

        System.out.println(neededLiters);
    }

}