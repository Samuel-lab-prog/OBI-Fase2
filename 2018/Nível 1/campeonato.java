import java.util.Scanner;
public class campeonato {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] posicoes = new int[17];

        int posMasterKung = 0, posMasterLu = 0;
        String[] fases = {"oitavas", "quartas", "semifinal", "final"};

        for(int i = 1; i <=16; i++){
            posicoes[i] = scanner.nextInt();
            if(posicoes[i] == 1) {
                posMasterKung = i;
            } else if(posicoes[i] == 9) {
                posMasterLu = i;
            }
        }

        for(String fase : fases) {
            posMasterKung = (posMasterKung + 1) / 2;
            posMasterLu = (posMasterLu + 1) / 2;
            if(posMasterKung == posMasterLu) {
                System.out.println(fase);
                break;
            }
        }
        scanner.close();

   } 
}
