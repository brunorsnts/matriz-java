package application;

import entities.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe principal da aplicação. Responsável por lidar com a iteração
 * do usuário (interface de console) e orquestrar o fluxo do programa.
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // --- Seção de Leitura das Dimensões da Matriz ---
            System.out.print("Enter the number of rows: ");
            int m = sc.nextInt();
            System.out.print("Enter the number of columns: ");
            int n = sc.nextInt();

            Matrix matrix = new Matrix(m, n);

            // --- Seção para Preencher a Matriz com Dados do Usuário ---
            System.out.println("Enter the matrix elements:");
            for (int i = 0; i < matrix.getRows(); i++) {
                for (int j = 0; j < matrix.getCols(); j++) {
                    matrix.setValue(i, j, sc.nextInt());
                }
            }

            System.out.println();
            System.out.print("Enter a number to find in the matrix: ");
            int x = sc.nextInt();
            System.out.println();

            // --- Seção para Encontrar o Número e Imprimir Vizinhos ---
            for (int i = 0; i < matrix.getRows(); i++) {
                for (int j = 0; j < matrix.getCols(); j++) {
                    // Se o valor na posição atual for igual ao número procurado...
                    if (matrix.getValue(i, j) == x) {
                        Position pos = new Position(i, j);
                        matrix.printNeighborsInfo(pos);
                        System.out.println();
                    }
                }
            }
        // --- Seção de Tratamento de Erros ---
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter only integer numbers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: The matrix dimensions are smaller than expected.");
        }

        sc.close();
    }
}