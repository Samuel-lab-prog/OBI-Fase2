import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class alfabeto {

    public static boolean validarMensagem(String mensagem, String caracteresValidos) {
        Set<Character> conjuntoValidos = new HashSet<>();

        for (char c : caracteresValidos.toCharArray()) {
            conjuntoValidos.add(c);
        }

        for (char c : mensagem.toCharArray()) {
            if (!conjuntoValidos.contains(c)) 
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.nextLine();
        String alfabetoAlien = scanner.nextLine();
        String mensgemAlien = scanner.nextLine();
        
        if(validarMensagem(mensgemAlien, alfabetoAlien))
            System.out.println("S");
        else
            System.out.println("N");
        
        scanner.close();
    }
}