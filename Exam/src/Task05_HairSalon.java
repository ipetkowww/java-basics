import java.util.Scanner;

public class Task05_HairSalon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int money = 0;
        int price = 0;
        boolean isTargetAchieved = false;

        while (true) {
            if (command.equals("closed")) {
                break;
            }
            switch (command) {
                case "haircut":
                    String typeHaircut = scanner.nextLine();
                    if (typeHaircut.equalsIgnoreCase("mens")) {
                        price = 15;
                    } else if (typeHaircut.equalsIgnoreCase("ladies")) {
                        price = 20;
                    } else if (typeHaircut.equalsIgnoreCase("kids")) {
                        price = 10;
                    }
                    break;
                case "color":
                    String colorType = scanner.nextLine();
                    if (colorType.equalsIgnoreCase("touch up")) {
                        price = 20;
                    } else if (colorType.equals("full color")) {
                        price = 30;
                    }
                    break;
            }
            money += price;
            if (money >= target) {
                isTargetAchieved = true;
                break;

            }
            command = scanner.nextLine();
        }

        if (isTargetAchieved) {
            System.out.println("You have reached your target for the day!");
        } else {
            System.out.printf("Target not reached! You need %dlv. more.%n", target - money);
        }
        System.out.printf("Earned money: %dlv.", money);
    }
}
