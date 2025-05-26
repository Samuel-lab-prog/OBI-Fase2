import java.util.Scanner;

public class codigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = scanner.nextInt();
        scanner.nextLine();
        String palavra = scanner.nextLine();

        StringBuilder resultado = new StringBuilder();
        int count = 1;

        for (int i = 1; i < tamanho; i++) {
            if (palavra.charAt(i) == palavra.charAt(i - 1))
                count++;
            else{
                resultado.append(count).append(" ").append(palavra.charAt(i - 1)).append(" ");
                count = 1;
            }
        }
        resultado.append(count).append(" ").append(palavra.charAt(tamanho - 1));
        System.out.println(resultado.toString());
        scanner.close();
    }
}
