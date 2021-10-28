import java.util.Scanner;

public class Exercise08_OnTimeForTheExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourArrived = Integer.parseInt(scanner.nextLine());
        int minArrived = Integer.parseInt(scanner.nextLine());

        int examTime = (hourExam * 60) + minExam;
        int arrivalTime = (hourArrived * 60) + minArrived;
        int difference = examTime - arrivalTime;

        if (difference > 30) {
            System.out.println("Early");

            if (difference > 59) {
                int hours = difference / 60;
                int minutes = difference % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            } else {
                System.out.printf("%d minutes before the start", difference);
            }
        } else if (difference < 0) {
            System.out.println("Late");
            int minutesLate = Math.abs(difference);
            if (minutesLate > 59) {
                int hours = minutesLate / 60;
                int minutes = minutesLate % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            } else {
                System.out.printf("%d minutes after the start", minutesLate);
            }
        } else {
            System.out.println("On time");
            if (difference > 0) {
                System.out.printf("%d minutes before the start", difference);
            }
        }
    }

}
