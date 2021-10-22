import java.util.Scanner;

public class Exercise04_VacationBookList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysCount = Integer.parseInt(scanner.nextLine());

        int neededHoursPerDay = pages / pagesPerHour / daysCount;
        System.out.println(neededHoursPerDay);
    }

}