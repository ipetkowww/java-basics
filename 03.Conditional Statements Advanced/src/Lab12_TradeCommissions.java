import java.util.Scanner;

public class Lab12_TradeCommissions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        boolean isError = false;

        if (sales < 0) {
            isError = true;
        } else {
            switch (city) {
                case "Sofia":
                    if (sales >= 0 && sales <= 500) {
                        sales *= 0.05;
                    } else if (sales <= 1000) {
                        sales *= 0.07;
                    } else if (sales <= 10000) {
                        sales *= 0.08;
                    } else {
                        sales *= 0.12;
                    }
                    break;
                case "Varna":
                    if (sales >= 0 && sales <= 500) {
                        sales *= 0.045;
                    } else if (sales <= 1000) {
                        sales *= 0.075;
                    } else if (sales <= 10000) {
                        sales *= 0.10;
                    } else {
                        sales *= 0.13;
                    }
                    break;
                case "Plovdiv":
                    if (sales >= 0 && sales <= 500) {
                        sales *= 0.055;
                    } else if (sales <= 1000) {
                        sales *= 0.08;
                    } else if (sales <= 10000) {
                        sales *= 0.12;
                    } else {
                        sales *= 0.145;
                    }
                    break;
                default:
                    isError = true;
                    break;
            }
        }
        if (isError) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", sales);
        }
    }

}