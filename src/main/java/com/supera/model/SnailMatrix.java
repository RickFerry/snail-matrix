package com.supera.model;

import java.util.ArrayList;
import java.util.List;

public class SnailMatrix {
    private final int[][] matrix;

    public SnailMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix cannot be null or empty");
        }
        this.matrix = matrix;
    }

    public List<Integer> snailOrder() {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) {
            return result;
        }

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            addTopRow(result, top++, left, right);
            addRightColumn(result, right--, top, bottom);
            if (top <= bottom) {
                addBottomRow(result, bottom--, left, right);
            }
            if (left <= right) {
                addLeftColumn(result, left++, top, bottom);
            }
        }

        return result;
    }

    private void addTopRow(List<Integer> result, int top, int left, int right) {
        for (int i = left; i <= right; i++) {
            result.add(matrix[top][i]);
        }
    }

    private void addRightColumn(List<Integer> result, int right, int top, int bottom) {
        for (int i = top; i <= bottom; i++) {
            result.add(matrix[i][right]);
        }
    }

    private void addBottomRow(List<Integer> result, int bottom, int left, int right) {
        for (int i = right; i >= left; i--) {
            result.add(matrix[bottom][i]);
        }
    }

    private void addLeftColumn(List<Integer> result, int left, int top, int bottom) {
        for (int i = bottom; i >= top; i--) {
            result.add(matrix[i][left]);
        }
    }
}