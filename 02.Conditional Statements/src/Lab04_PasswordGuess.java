import java.util.Scanner;

public class Lab04_PasswordGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPassword = scanner.nextLine();
        String validPassword = "s3cr3t!P@ssw0rd";

        boolean isValidPassword = inputPassword.equals(validPassword);
        System.out.println(isValidPassword ? "Welcome" : "Wrong password!");
    }

}