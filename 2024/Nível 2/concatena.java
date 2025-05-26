import java.util.Scanner;

public class concatena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        int[] D = new int[N + 1]; 
        long[] resultados = new long[Q];

        for(int i = 1; i <= N; i++) 
            D[i] = scanner.nextInt();

        for(int i = 0; i < Q; i++) {
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            long soma = 0;

            for(int k = L; k <= R; k++)
                soma += 11 * D[k] * (R - L);
            resultados[i] = soma;
        }
        for(int i = 0; i < Q; i++)
            System.out.println(resultados[i]);

        scanner.close();
    }
}