import java.util.Scanner;

public class Lab06_MinNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;


        while (!"Stop".equals(command)) {
            int number = Integer.parseInt(command);
            if (number < minNumber) {
                minNumber = number;
            }
            command = scanner.nextLine();
        }
        System.out.println(minNumber);
    }

}
