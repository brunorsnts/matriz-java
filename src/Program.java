import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        System.out.print("Position ");
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.print("Position ");
                    System.out.println(i + "," + j + ":");
                    if (j - 1 >=0) {
                        System.out.print("Left: " + matriz[i][j-1] + "\n");
                    }
                    if (j + 1 < matriz[i].length) {
                        System.out.print("Right: " + matriz[i][j + 1] + "\n");
                    }

                    if (i - 1 >=0) {
                        System.out.print("UP: " + matriz[i-1][j] + "\n");
                    }

                    if (i + 1 <=matriz[i].length) {
                        System.out.print("Down: " + matriz[i + 1][j] + "\n");
                    }



                }
            }
        }

        sc.close();
    }
}
