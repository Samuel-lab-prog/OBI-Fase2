import java.util.*;

public class grupos {

    public static String codificaPar(int a, int b) {
        return a < b ? a + "-" + b : b + "-" + a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int E = scanner.nextInt();
        int M = scanner.nextInt();
        int D = scanner.nextInt();

        Map<Integer, Integer> grupoPorAluno = new HashMap<>();
        Set<String> gostarJuntos = new HashSet<>();
        Set<String> naoGostarJuntos = new HashSet<>();

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            gostarJuntos.add(codificaPar(a, b));
        }

        for (int i = 0; i < D; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            naoGostarJuntos.add(codificaPar(a, b));
        }

        int grupoId = 0;
        for (int i = 0; i < E / 3; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            grupoPorAluno.put(a, grupoId);
            grupoPorAluno.put(b, grupoId);
            grupoPorAluno.put(c, grupoId);
            grupoId++;
        }

        int violacoes = 0;

        for (String par : gostarJuntos) {
            String[] partes = par.split("-");
            int a = Integer.parseInt(partes[0]);
            int b = Integer.parseInt(partes[1]);
            if (!grupoPorAluno.get(a).equals(grupoPorAluno.get(b))) {
                violacoes++;
            }
        }

        for (String par : naoGostarJuntos) {
            String[] partes = par.split("-");
            int a = Integer.parseInt(partes[0]);
            int b = Integer.parseInt(partes[1]);
            if (grupoPorAluno.get(a).equals(grupoPorAluno.get(b))) {
                violacoes++;
            }
        }
        System.out.println(violacoes);
        scanner.close();
    }
}
