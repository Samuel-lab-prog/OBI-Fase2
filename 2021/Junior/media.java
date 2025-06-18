import java.util.Scanner;
import java.util.Arrays;

public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();

        long resposta = Long.MIN_VALUE;

        for (long C = -2000000000L; C <= 2000000000L; C++) {
            long[] numeros = {A, B, C};
            Arrays.sort(numeros);

            long media = (A + B + C) / 3;
            long mediana = numeros[1];

            if (media == mediana) {
                resposta = C;
                break;
            }
        }

        System.out.println(resposta);

        scanner.close();
    }
}
