import java.util.*;

public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int minC = Integer.MAX_VALUE;

        for (int mediana : new int[]{A, B}) {
            int C = 3 * mediana - A - B;

            int[] arr = new int[]{A, B, C};
            Arrays.sort(arr);
            int realMediana = arr[1];

            if (realMediana == mediana) {
                minC = Math.min(minC, C);
            }
        }
        System.out.println(minC);
        scanner.close();
    }
}
