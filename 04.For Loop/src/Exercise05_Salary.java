import java.util.Scanner;

public class Exercise05_Salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int openedBrowserTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        boolean hasSalary = true;

        for (int i = 0; i < openedBrowserTabs; i++) {
            String website = scanner.nextLine();
            switch (website) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                hasSalary = false;
                break;
            }
        }
        if (hasSalary) {
            System.out.println(salary);
        }
    }

}
