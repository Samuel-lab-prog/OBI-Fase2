import java.util.Locale;
import java.util.Scanner;

public class tanque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int consumo = scanner.nextInt();
        int distancia = scanner.nextInt();
        int combustivel = scanner.nextInt();

        int distanciaPossivel = consumo * combustivel;
        int distanciaRestante = distancia - distanciaPossivel;
        double litros = 0;

        if(distanciaRestante <= 0) 
            System.out.println("0");
        else {
            litros = (double) distanciaRestante / consumo;
            System.out.println(String.format(Locale.US, "%.1f", litros));
        }
        scanner.close();
    }
}