import java.util.Scanner;

public class Task06_Substitute {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int substituteCount = 0;

        for (int i = k; i <= 8; i++) {
            for (int j = 9; j >= l; j--) {
                for (int o = m; o <= 8; o++) {
                    for (int p = 9; p >= n; p--) {
                        if (i % 2 == 0 && o % 2 == 0 && j % 2 == 1 && p % 2 == 1) {
                            String firstPlayerNum = "" + i + j;
                            String secondPlayerNum = "" + o + p;
                            if (firstPlayerNum.equals(secondPlayerNum)) {
                                System.out.println("Cannot change the same player.");
                            } else {
                                System.out.printf("%s - %s%n", firstPlayerNum, secondPlayerNum);
                                substituteCount++;
                                if (substituteCount == 6) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
