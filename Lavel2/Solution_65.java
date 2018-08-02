package Lavel2;

/*
Таблица умножения
*/

public class Solution_65 {
    public static void main(String[] args) {
        int[][] matrixA = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrixA[i][j] = (i + 1) * (j + 1);
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
    }
}


