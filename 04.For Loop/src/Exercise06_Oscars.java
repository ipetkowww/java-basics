import java.util.Scanner;

public class Exercise06_Oscars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int countOfPeopleGivingPoints = Integer.parseInt(scanner.nextLine());
        boolean enoughPoints = false;
        double neededPointsForOscar = 1250.5;

        for (int i = 0; i < countOfPeopleGivingPoints; i++) {
            String nameOfPersonGivingPoints = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            double currentPoints = (nameOfPersonGivingPoints.length() * points) / 2;
            academyPoints += currentPoints;
            if (academyPoints > neededPointsForOscar) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, academyPoints);
                enoughPoints = true;
                break;
            }
        }

        if (!enoughPoints) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, neededPointsForOscar - academyPoints);
        }
    }

}
