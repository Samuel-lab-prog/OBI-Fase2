import java.util.Scanner;

public class pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int participantes = scanner.nextInt();
        int pizza8 = scanner.nextInt();
        int pizza6 = scanner.nextInt();

        int totalPizzas = pizza6 * 6 + pizza8 * 8;

        if(totalPizzas - participantes > 0)
            System.out.println(totalPizzas - participantes);
        else
            System.out.println("0");

        scanner.close();
    }
}