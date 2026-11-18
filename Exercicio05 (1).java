package exercicio05;

public class Exercicio05 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("Digite um número: "));
            }
        }

        IO.print("Diagonal principal: ");

        for (int i = 0; i < 3; i++) {
            IO.print(m[i][i] + " ");
        }

        IO.println("");
    }
}
