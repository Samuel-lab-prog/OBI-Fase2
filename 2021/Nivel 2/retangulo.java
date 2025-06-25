import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numArvores = scanner.nextInt();
        int distancias[] = new int[numArvores];
        int soma = 0;

        for (int i = 0; i < numArvores; i++) {
            distancias[i] = scanner.nextInt();
            soma += distancias[i];
        }
        scanner.close();
        if (soma % 2 != 0) {
            System.out.println("N");
            return;
        }

        int meiaCircunferencia = soma / 2;

        for (int i = 0; i < numArvores; i++) {
            int distancia1 = 0;
            for (int j = 0; j < numArvores; j++) {
                distancia1 += distancias[(i + j) % numArvores];
                if (distancia1 == meiaCircunferencia) {
                    int distancia2 = 0;
                    for (int k = j + 1; k < numArvores; k++) {
                        distancia2 += distancias[(i + k) % numArvores];
                        if (distancia2 == meiaCircunferencia) {
                            System.out.println("S");
                            return;
                        }
                        if (distancia2 > meiaCircunferencia) break;
                    }
                    break;
                }
                if (distancia1 > meiaCircunferencia) break;
            }
        }
        System.out.println("N");
    }
}
