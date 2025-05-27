import java.util.*;

public class trofeu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pontuacoes = new int[5];

        for (int i = 0; i < 5; i++) 
            pontuacoes[i] = scanner.nextInt();
        
        int trofeus = 1; 
        for(int i = 1; i < 5; i++) {
            if(pontuacoes[i] == pontuacoes[0]) 
                trofeus++;
             else 
                break;
        }

        int placas = 0;
        if(trofeus < 5) {
            int segundaMaior = pontuacoes[trofeus];
            for(int i = trofeus; i < 5; i++){
                if(pontuacoes[i] == segundaMaior) 
                    placas++;
                else 
                    break;
            }
        }
        System.out.println(trofeus + " " + placas);
        scanner.close();
    }
}
