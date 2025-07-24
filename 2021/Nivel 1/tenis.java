import java.util.Scanner;

public class tenis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] niveis = new int[4];
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            niveis[i] = scanner.nextInt();
            soma += niveis[i];
        }
        int menorDif = 10000;

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                if (i == k)
                    continue;
                else {
                    int somaDupla = niveis[i] + niveis[k];
                    int somaOutraDupla = soma - somaDupla;
                    int diferenca = Math.abs(somaOutraDupla - somaDupla);

                    if (diferenca < menorDif)
                        menorDif = diferenca;
                }
            }
        }
        System.out.println(menorDif);
        scanner.close();
    }
}