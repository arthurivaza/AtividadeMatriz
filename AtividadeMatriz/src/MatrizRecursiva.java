public class MatrizRecursiva {

    public static void main(String[] args) {
        int linhas = 3;
        int colunas = 4;

        int[][] matriz = criarMatriz(linhas, colunas);
        System.out.println("Matriz criada:");
        exibirMatriz(matriz);

        System.out.println("\nElementos da matriz exibidos recursivamente:");
        exibirElementosMatrizRecursivo(matriz, 0, 0);
    }

    public static int[][] criarMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        int contador = 1;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }

        return matriz;
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void exibirElementosMatrizRecursivo(int[][] matriz, int linha, int coluna) {
        if (linha >= matriz.length) {
            return;  // Caso base: todas as linhas foram processadas
        }
        if (coluna >= matriz[0].length) {
            exibirElementosMatrizRecursivo(matriz, linha + 1, 0);  // Move para a próxima linha
        } else {
            System.out.print(matriz[linha][coluna] + " ");
            exibirElementosMatrizRecursivo(matriz, linha, coluna + 1);  // Continua na mesma linha
        }
    }
}
