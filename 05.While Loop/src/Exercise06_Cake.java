import java.util.Scanner;

public class Exercise06_Cake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cake = width * length;
        String command = scanner.nextLine();
        boolean hasCake = true;

        while (!"STOP".equals(command)) {
            int piece = Integer.parseInt(command);
            cake -= piece;
            if (cake < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cake));
                hasCake = false;
                break;
            }
            command = scanner.nextLine();
        }
        if (hasCake) {
            System.out.printf("%d pieces are left.",cake);
        }
    }

}
