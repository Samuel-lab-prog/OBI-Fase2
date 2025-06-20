import java.util.Scanner;

public class torre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimensao = scanner.nextInt();
        int resultado = 0;

        int[][] tabuleiro = new int[dimensao][dimensao];

        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++)
                tabuleiro[i][j] = scanner.nextInt();
        }

        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                int casa = tabuleiro[i][j];
                int soma = 0;
                for (int k = 0; k < dimensao; k++) {
                    soma += tabuleiro[k][j];
                    soma += tabuleiro[i][k];
                }
                soma -= 2 * tabuleiro[i][j];
                if (soma > resultado)
                    resultado = soma;
            }
        }
        System.out.println(resultado);
        scanner.close();
    }
}
