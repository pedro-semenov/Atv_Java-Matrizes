package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        int[][] m = new int[2][3];
        int pares = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("Digite um número: "));

                if (m[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        IO.println("Quantidade de pares: " + pares);
    }
}
