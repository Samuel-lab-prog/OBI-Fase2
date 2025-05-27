import java.util.Scanner;

public class caminho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] potencias = new int[N];

        for(int i = 0; i < N; i++) 
            potencias[i] = scanner.nextInt();
        
        int maxSeq = 0, currSeq = 0;

        for(int i = 0; i < N; i++) {
            int a = potencias[i];
            int b = potencias[(i + 1) % N];
            if(a + b < 1000) {
                currSeq++;
                maxSeq = Math.max(maxSeq, currSeq);
            }
            else 
                currSeq = 0;
        }
        scanner.close();
        System.out.println(maxSeq);
    }
}
