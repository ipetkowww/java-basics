import java.util.Scanner;

public class Exercise07_TrekkingMania {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupsCount = Integer.parseInt(scanner.nextLine());
        int allPeople = 0;
        int peopleForMusala = 0;
        int peopleForMonblan = 0;
        int peopleForKilimanjaro = 0;
        int peopleForK2 = 0;
        int peopleForEverest = 0;

        for (int i = 0; i < groupsCount; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            if (peopleInGroup <= 5) {
                peopleForMusala += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                peopleForMonblan += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                peopleForKilimanjaro += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                peopleForK2 += peopleInGroup;
            } else {
                peopleForEverest += peopleInGroup;
            }
            allPeople += peopleInGroup;
        }
        System.out.printf("%.2f%%%n", (peopleForMusala * 1.0 / allPeople) * 100);
        System.out.printf("%.2f%%%n", (peopleForMonblan * 1.0 / allPeople) * 100);
        System.out.printf("%.2f%%%n", (peopleForKilimanjaro * 1.0 / allPeople) * 100);
        System.out.printf("%.2f%%%n", (peopleForK2 * 1.0 / allPeople) * 100);
        System.out.printf("%.2f%%", (peopleForEverest * 1.0 / allPeople) * 100);
    }

}
