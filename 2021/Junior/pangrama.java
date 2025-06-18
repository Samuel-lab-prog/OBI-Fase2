import java.util.Scanner;
import java.util.ArrayList;

public class pangrama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra = scanner.nextLine();
        char[] temp = palavra.toCharArray();

        ArrayList<Character> letrasPalavra = new ArrayList<>();
        for(int i = 0; i < temp.length; i++)
            letrasPalavra.add(temp[i]);

        boolean resultado = false;

        ArrayList<Character> alfabeto = new ArrayList<>();
        alfabeto.add('a'); 
        alfabeto.add('b'); 
        alfabeto.add('c'); 
        alfabeto.add('d'); 
        alfabeto.add('e'); 
        alfabeto.add('f'); 
        alfabeto.add('g'); 
        alfabeto.add('h'); 
        alfabeto.add('i'); 
        alfabeto.add('j'); 
        alfabeto.add('l'); 
        alfabeto.add('m'); 
        alfabeto.add('n'); 
        alfabeto.add('o'); 
        alfabeto.add('p'); 
        alfabeto.add('q'); 
        alfabeto.add('r'); 
        alfabeto.add('s'); 
        alfabeto.add('t'); 
        alfabeto.add('u'); 
        alfabeto.add('v'); 
        alfabeto.add('x'); 
        alfabeto.add('z'); 

        

        if(letrasPalavra.containsAll(alfabeto))
            resultado = true;
            
        if(resultado)
            System.out.println("S");
        else
            System.out.println("N");

        scanner.close();
    }
}