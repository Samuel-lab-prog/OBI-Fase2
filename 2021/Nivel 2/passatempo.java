import java.util.Scanner;

public class passatempo {

    public static int calcularVariavel(String variaveis, int valor) {
        int resultado = 0;
        String[] partes = variaveis.split(" ");
        int soma = 0;
        for(String parte : partes) {
            int valorParte = Integer.parseInt(parte);
            soma += valorParte;
        }
        resultado = (soma / partes.length);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int linhas = scanner.nextInt();
        int colunas = scanner.nextInt();

        scanner.close();
    }
}