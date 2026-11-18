package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("Digite um número: "));
            }
        }

        IO.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                IO.print(m[i][j] + " ");
            }
            IO.println("");
        }
    }
}
