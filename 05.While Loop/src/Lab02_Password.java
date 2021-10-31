import java.util.Scanner;

public class Lab02_Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String inputPassword = scanner.nextLine();

        while (true) {
            if (password.equals(inputPassword)) {
                System.out.printf("Welcome %s!", username);
                break;
            }
            inputPassword = scanner.nextLine();
        }
    }

}
