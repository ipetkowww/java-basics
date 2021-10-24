import java.util.Scanner;

public class Exercise06_WorldSwimmingRecord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        int each15meter = (int) (distanceMeters / 15);
        double totalTime = (distanceMeters * time) + (each15meter * 12.5);

        if (recordInSeconds <= totalTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordInSeconds);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }

}