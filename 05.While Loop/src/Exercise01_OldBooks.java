import java.util.Scanner;

public class Exercise01_OldBooks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wantedBook = scanner.nextLine();
        String book = scanner.nextLine();
        int checkedBooks = 0;
        boolean isBookFound = false;

        while (!"No More Books".equals(book)) {
            if (wantedBook.equals(book)) {
                System.out.printf("You checked %d books and found it.", checkedBooks);
                isBookFound = true;
                break;
            }
            book = scanner.nextLine();
            checkedBooks++;
        }

        if (!isBookFound) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", checkedBooks);
        }
    }

}
