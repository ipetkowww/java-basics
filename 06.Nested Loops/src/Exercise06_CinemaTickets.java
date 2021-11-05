import java.util.Scanner;

public class Exercise06_CinemaTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int standardTickets = 0;
        int kidTickets = 0;
        int studentTickets = 0;
        int allTickets = 0;
        int allCurrentTickets = 0;

        while (!"Finish".equals(movieName)) {
            int freeSpaceInCinema = Integer.parseInt(scanner.nextLine());
            while(true) {
                String ticketType = scanner.nextLine();
                if ("End".equals(ticketType)) {
                    break;
                }
                switch (ticketType) {
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                    case "student":
                        studentTickets++;
                        break;
                }
                allCurrentTickets++;
                allTickets++;
                if (freeSpaceInCinema - allCurrentTickets <= 0) {
                    break;
                }
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, (allCurrentTickets * 1.0 / freeSpaceInCinema) * 100);
            movieName = scanner.nextLine();
            allCurrentTickets = 0;
        }
        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", (studentTickets * 1.0 / allTickets ) * 100);
        System.out.printf("%.2f%% standard tickets.%n", (standardTickets * 1.0 / allTickets ) * 100);
        System.out.printf("%.2f%% kids tickets.%n", (kidTickets * 1.0 / allTickets ) * 100);
    }

}
