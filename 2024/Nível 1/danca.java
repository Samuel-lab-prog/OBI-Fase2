import java.util.*;

public class danca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = scanner.nextInt();
        int colunas = scanner.nextInt(); 
        int numPassos = scanner.nextInt();

        int[][] pista = new int[linhas][colunas];
        int contador = 1;
        for(int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) 
                pista[i][j] = contador++;
        }

        for(int i = 0; i < numPassos; i++) {
            String tipo = scanner.next(); 
            int A = scanner.nextInt() - 1; 
            int B = scanner.nextInt() - 1;

            if(tipo.equals("L")) {
                int[] temp = pista[A];
                pista[A] = pista[B];
                pista[B] = temp;
            } else {
                for(int linha = 0; linha < linhas; linha++) {
                    int temp = pista[linha][A];
                    pista[linha][A] = pista[linha][B];
                    pista[linha][B] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) 
                sb.append(pista[i][j]).append(" ");
            sb.append("\n");
        }
        System.out.print(sb.toString());
        scanner.close();
    }
}

