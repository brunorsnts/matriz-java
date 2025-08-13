package entities;

/**
 * Representa uma matriz de inteiros bidimensional e encapsula as operações
 * relacionadas a ela, como definir/obter valores e encontrar vizinhos.
 */
public class Matrix {

    // Estrutura de dados interna para armazenar os elementos da matriz.
    private int[][] data;

    /**
     * Constrói uma Matriz com um número especificado de linhas e colunas.
     *
     * @param rows O número de linhas da matriz.
     * @param cols O número de colunas da matriz.
     */
    public Matrix(int rows, int cols) {
        data = new int[rows][cols];
    }

    public int getRows() {
        return data.length;
    }

    public int getCols() {
        // Assume que a matriz não é vazia e todas as linhas têm o mesmo comprimento.
        return data[0].length;
    }

    /**
     * Obtém o valor em uma posição específicada da matriz.
     * @param row A linha do valor.
     * @param col A coluna do valor.
     * @return O valor inteiro na posição especificada.
     */
    public int getValue(int row, int col) {
        return data[row][col];
    }

    /**
     * Define um valor em uma posição específica da matriz.
     * @param row A linha onde o valor será inserido.
     * @param col A coluna onde o valor será inserido.
     * @param value O valor inteiro a ser inserido.
     */
    public void setValue(int row, int col, int value) {
        data[row][col] = value;
    }

    /**
     * Encontra e imprime os valores dos vizinhos adjacentes (Cima, Baixo, Esquerda, Direita)
     * para uma dada posição na matriz, realizando as devidas verificações de borda.
     *
     * @param pos O objeto Position contendo a linha e a coluna a ser verificada.
     */
    public void printNeighborsInfo(Position pos) {
        int r = pos.getRow();
        int c = pos.getColumn();

        System.out.println("Position " + pos + ":");

        // Verifica se existe um vizinho à esquerda (índice da coluna não é negativo).
        if (c - 1 >= 0) {
            System.out.println("Left: " + data[r][c - 1]);
        }

        // Verifica se existe um vizinho à direita (índice da coluna está dentro dos limites).
        if (c + 1 < data[r].length) {
            System.out.println("Right: " + data[r][c + 1]);
        }
        // Verifica se existe um vizinho acima (índice da linha não é negativo).
        if (r - 1 >= 0) {
            System.out.println("Up: " + data[r - 1][c]);
        }
        // Verifica se existe um vizinho abaixo (índice da linha está dentro dos limites).
        if (r + 1 < data.length) {
            System.out.println("Down: " + data[r + 1][c]);
        }

    }
}
