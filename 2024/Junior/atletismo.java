import java.util.Scanner;

public class atletismo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        int[] atletas = new int[quantidade];

        for(int i = 0; i < quantidade; i++)
            atletas[scanner.nextInt() - 1] = i;

        for(int i = 0; i < quantidade; i++)
            System.out.println(atletas[i] + 1);
        
        scanner.close();
    }
}
