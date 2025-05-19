import java.util.Scanner;

public class avenida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distancia = scanner.nextInt();

        int pontoMaisProximo = 400 * Math.round(distancia / 400.0f);
        int caminhada = Math.abs(distancia - pontoMaisProximo);
        
        System.out.println(caminhada);
        scanner.close();
    }
}