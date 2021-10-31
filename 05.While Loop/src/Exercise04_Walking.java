import java.util.Scanner;

public class Exercise04_Walking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stepsGoal = 10000;
        int allSteps = 0;
        String command = scanner.nextLine();
        boolean goalReached = false;


        while (true) {
            if ("Going home".equals(command)) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                allSteps += stepsToHome;
                if (allSteps >= stepsGoal) {
                    goalReached = true;
                } else {
                    System.out.printf("%d more steps to reach goal.", stepsGoal - allSteps);
                }
                break;
            } else {
                int steps = Integer.parseInt(command);
                allSteps += steps;
                if (allSteps >= stepsGoal) {
                    goalReached = true;
                    break;
                }
            }
            command = scanner.nextLine();
        }
        if (goalReached) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", allSteps - stepsGoal);
        }
    }

}
