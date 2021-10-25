import java.util.Scanner;

public class Lab07_WorkingHours {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();
        boolean isOpen = false;

        if (hour > 10 && hour < 18) {
            switch (dayOfWeek) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    isOpen =  true;
                    break;
            }
        }
        System.out.println(isOpen ? "open" : "closed");
    }

}