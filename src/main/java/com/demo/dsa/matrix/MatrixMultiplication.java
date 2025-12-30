package com.demo.dsa.matrix;

public class MatrixMultiplication {
    
    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6} };
        int[][] matrix2 = { {7, 8}, {9, 10}, {11, 12} };
        
        int[][] result = multiplyMatrices(matrix1, matrix2);
        
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        
        System.out.println("Product of Matrix 1 and Matrix 2:");
        printMatrix(result);
    }
    
    // Function to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        
        // Check if matrix multiplication is possible
        if (cols1 != matrix2.length) {
            throw new IllegalArgumentException("Number of columns in Matrix 1 must be equal to number of rows in Matrix 2.");
        }
        
        int[][] result = new int[rows1][cols2];
        
        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        return result;
    }
    
    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
