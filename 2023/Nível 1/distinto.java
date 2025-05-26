import java.util.*;
public class distinto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        int[] seq = new int[quantidade];
        for (int i = 0; i < quantidade; i++) 
            seq[i] = scanner.nextInt();
        
        Set<Integer> set = new HashSet<>();
        int maxTam = 0;
        int inicio = 0;

        for(int i = 0; i < quantidade; i++) {
            while (set.contains(seq[i])) {
                set.remove(seq[inicio]);
                inicio++;
            }
            set.add(seq[i]);
            maxTam = Math.max(maxTam, i - inicio + 1);
        }
        System.out.println(maxTam);
        scanner.close();
    }
}
