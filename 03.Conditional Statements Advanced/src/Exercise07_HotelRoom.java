import java.util.Scanner;

public class Exercise07_HotelRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50 * nightsCount;
                apartmentPrice = 65 * nightsCount;
                if (nightsCount > 14) {
                    studioPrice -= studioPrice * 0.30;
                } else if (nightsCount > 7) {
                    studioPrice -= studioPrice * 0.05;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20 * nightsCount;
                apartmentPrice = 68.70 * nightsCount;
                if (nightsCount > 14) {
                    studioPrice -= studioPrice * 0.2;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76 * nightsCount;
                apartmentPrice = 77 * nightsCount;
                break;
        }
        if (nightsCount > 14) {
            apartmentPrice -= apartmentPrice * 0.1;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }

}
