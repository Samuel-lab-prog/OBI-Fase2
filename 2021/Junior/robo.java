import java.util.Scanner;

public class robo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int C = scanner.nextInt();
        int S = scanner.nextInt();

        int posicao = 1;
        int contador = 0;

        if(posicao == S)
            contador++;

        for(int i = 0; i < C; i++) {
            int comando = scanner.nextInt();
            if(comando == 1) {
                posicao++;
                if (posicao > N) 
                    posicao = 1; 
            } 
            else if(comando == -1) {
                posicao--;
                if(posicao < 1) 
                    posicao = N; 
            }
            if(posicao == S) 
                contador++;
        }
        System.out.println(contador);
        scanner.close();
    }
}
