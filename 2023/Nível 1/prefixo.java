import java.util.Scanner;

public class prefixo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho1 = scanner.nextInt();
        scanner.nextLine();
        String palavra1 = scanner.nextLine();              
        int tamanho2 = Integer.parseInt(scanner.nextLine()); 
        scanner.nextLine();
        String palavra2 = scanner.nextLine();              

        int tamanhoMinimo = Math.min(tamanho1, tamanho2);
        int prefixoComum = 0;

        for(int i = 0; i < tamanhoMinimo; i++) {
            if(palavra1.charAt(i) == palavra2.charAt(i)) 
                prefixoComum++;
            else 
                break;
        }
        System.out.println(prefixoComum);
        scanner.close();
    }
}
