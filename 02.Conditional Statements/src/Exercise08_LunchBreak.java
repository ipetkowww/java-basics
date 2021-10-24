import java.util.Scanner;

public class Exercise08_LunchBreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serial = scanner.nextLine();
        int episodeLen = Integer.parseInt(scanner.nextLine());
        int breakLen = Integer.parseInt(scanner.nextLine());

        double timeForLunch = breakLen * 1.0 / 8;
        double timeForBreak = breakLen * 1.0 / 4;
        double time = breakLen - timeForLunch - timeForBreak;

        if (time >= episodeLen) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(time - episodeLen));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(episodeLen - time));
        }
    }

}