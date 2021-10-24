import java.util.Scanner;

public class Lab07_AreaOfFigures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        double area;

        switch (figure) {
            case "square":
                double a = Double.parseDouble(scanner.nextLine());
                area = a * a;
                System.out.println(area);
                break;
            case "rectangle":
                double b = Double.parseDouble(scanner.nextLine());
                double c = Double.parseDouble(scanner.nextLine());
                area = b * c;
                System.out.println(area);
                break;
            case "circle":
                double radius = Double.parseDouble(scanner.nextLine());
                area = Math.PI * radius * radius;
                System.out.println(area);
                break;
            case "triangle":
                double n = Double.parseDouble(scanner.nextLine());
                double m = Double.parseDouble(scanner.nextLine());
                area = n * m / 2;
                System.out.println(area);
                break;
        }
    }

}