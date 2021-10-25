import java.util.Scanner;

public class Lab11_FruitShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        boolean isError = false;
        double price = 0;

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        price = quantity * 2.50;
                        break;
                    case "apple":
                        price = quantity * 1.2;
                        break;
                    case "orange":
                        price = quantity * 0.85;
                        break;
                    case "grapefruit":
                        price = quantity * 1.45;
                        break;
                    case "kiwi":
                        price = quantity * 2.7;
                        break;
                    case "pineapple":
                        price = quantity * 5.50;
                        break;
                    case "grapes":
                        price = quantity * 3.85;
                        break;
                    default:
                        isError = true;
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        price = quantity * 2.70;
                        break;
                    case "apple":
                        price = quantity * 1.25;
                        break;
                    case "orange":
                        price = quantity * 0.9;
                        break;
                    case "grapefruit":
                        price = quantity * 1.6;
                        break;
                    case "kiwi":
                        price = quantity * 3;
                        break;
                    case "pineapple":
                        price = quantity * 5.6;
                        break;
                    case "grapes":
                        price = quantity * 4.20;
                        break;
                    default:
                        isError = true;
                        break;
                }
                break;
            default:
                isError = true;
                break;
        }

        if (isError) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", price);
        }
    }

}