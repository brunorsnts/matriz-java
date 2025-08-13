package entities;

/**
 * Representa um par de coordenadas (linha e coluna) em uma matriz bidimensional.
 * Facilita o transporte e a manipulação de posições no código.
 */
public class Position {
    private int row;
    private int column;

    /**
     * Constrói um Objeto Position com as coordenadas especificadas.
     * 
     * @param row A linha da posição (índice).
     * @param column A coluna da posição (índice).
     */
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    /**
     * Retorna a linha da posição.
     * @return O índice da linha.
     */
    public int getRow() {
        return row;
    }

    /**
     * Retorna a coluna da posição.
     * @return O índice da coluna.
     */
    public int getColumn() {
        return column;
    }

    /**
     * Fornece uma representação em String da posição no formato "linha,coluna".
     * Exemplo: "2,3".
     * @return A string formatada das coordenadas.
     */
    @Override
    public String toString() {
        return row + "," + column;
    }
}