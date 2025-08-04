import java.util.Scanner;

public class copa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt(); 
        int l = scanner.nextInt(); 

        String[] fases = {"oitavas", "quartas", "semifinal", "final"};

        for (String fase : fases) {
            k = (k + 1) / 2;
            l = (l + 1) / 2;

            if (k == l) {
                System.out.println(fase);
                break;
            }
        }
        scanner.close();
    }
}
