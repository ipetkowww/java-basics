import java.util.Scanner;

public class Lab03_EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(number % 2 == 0 ? "even" : "odd");
    }

}