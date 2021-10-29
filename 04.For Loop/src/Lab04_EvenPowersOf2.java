import java.util.Scanner;

public class Lab04_EvenPowersOf2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(1);
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.printf("%.0f%n" ,Math.pow(2, i));
            }
        }
    }

}
