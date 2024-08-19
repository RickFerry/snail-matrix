package com.supera;

import com.supera.model.SnailMatrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 10, 12},
                {6, 7, 33}
        };

        SnailMatrix snail1 = new SnailMatrix(matrix1);
        SnailMatrix snail2 = new SnailMatrix(matrix2);

        System.out.println(snail1.snailOrder()); // Esperado: [1, 2, 3, 6, 9, 8, 7, 4, 5]
        System.out.println(snail2.snailOrder()); // Esperado: [1, 2, 3, 12, 33, 7, 6, 4, 10]
    }
}
