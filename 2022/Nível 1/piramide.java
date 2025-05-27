import java.util.Scanner;

public class piramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int distBorda = Math.min(Math.min(i, j), Math.min(N - 1 - i, N - 1 - j));
                System.out.print((distBorda + 1) + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
