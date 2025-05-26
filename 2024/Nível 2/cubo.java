import java.util.Scanner;

public class cubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = scanner.nextInt();

        int cubinho0 = (tamanho-2) * (tamanho-2) * (tamanho-2);
        int cubinho1 = 6 * ((tamanho - 2) * (tamanho - 2));
        int cubinho2 = 12 * (tamanho - 2);
        int cubinho3 = 8;

        System.out.println(cubinho0);
        System.out.println(cubinho1);
        System.out.println(cubinho2);
        System.out.println(cubinho3);

        scanner.close();
    }
}