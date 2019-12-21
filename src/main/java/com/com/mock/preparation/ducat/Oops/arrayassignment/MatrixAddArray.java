package com.mock.preparation.ducat.Oops.arrayassignment;

public class MatrixAddArray {
    public static void main(String[] args) {
        try {
            int x[][] = new int[][]{{3, 5, 2, 4},
                    {2, 6, 3, 4}};

            int y[][] = new int[][]{{5, 3, 1, 5},
                    {2, 5, 3, 4}};

            int z[][] = new int[2][4];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    z[i][j] = x[i][j] + y[i][j];
                    System.out.print(z[i][j] + "  ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println();
        }
    }
}
