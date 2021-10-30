import java.util.Scanner;

public class Exercise08_TennisRanks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int allPoints = startingPoints;
        int count = 0;
        int wonTournaments = 0;

        for (int i = 0; i < tournamentsCount; i++) {
            String tournamentPhase = scanner.nextLine();
            count++;
            switch (tournamentPhase) {
                case "W":
                    allPoints += 2000;
                    wonTournaments++;
                    break;
                case "F":
                    allPoints += 1200;
                    break;
                case "SF":
                    allPoints += 720;
                    break;
            }

        }
        System.out.printf("Final points: %d%n", allPoints);
        System.out.printf("Average points: %.0f%n", Math.floor((allPoints - startingPoints) * 1.0 / count));
        System.out.printf("%.2f%%", (wonTournaments * 1.0 / count) * 100);
    }

}
