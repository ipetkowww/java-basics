import java.util.Scanner;

public class Exercise07_Moving {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int availableSpace = width * length * height;
        boolean hasFreeSpace = true;

        while (!"Done".equals(command)) {
            int pack = Integer.parseInt(command);
            availableSpace -= pack;
            if (availableSpace < 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(availableSpace));
                hasFreeSpace = false;
                break;
            }
            command = scanner.nextLine();
        }
        if (hasFreeSpace) {
            System.out.printf("%d Cubic meters left.", availableSpace);
        }
    }

}
