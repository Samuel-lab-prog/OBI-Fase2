import java.util.Scanner;

class codigo{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int qtd = scanner.nextInt();

        int primeiro = scanner.nextInt();
        int segundo = scanner.nextInt();
        int terceiro = scanner.nextInt();

        int vezes = 0;

        if(primeiro == 1 && segundo == 0 && terceiro == 0)
                vezes++;

        for(int i = 3; i < qtd; i++){
            primeiro = segundo;
            segundo = terceiro;
            terceiro = scanner.nextInt();
            if(primeiro == 1 & segundo == 0 && terceiro == 0)
                vezes++;
        }
        System.out.println(vezes);

        scanner.close();
    }
}