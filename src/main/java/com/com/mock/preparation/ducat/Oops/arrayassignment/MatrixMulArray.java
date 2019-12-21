package com.mock.preparation.ducat.Oops.arrayassignment;

public class MatrixMulArray {
    public static void main(String[] args) {
        int x[][] = new int[][]{{2, 4, 6}, {2, 2, 2}, {1, 1, 1}};
        int y[][] = new int[][]{{1, 1, 1}, {4, 5, 6}, {5, 4, 3}};

        int z[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                z[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    z[i][j] += x[i][k] * y[k][j];
                }
                System.out.print(z[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

