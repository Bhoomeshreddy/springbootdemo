package com.demo.dsa.matrix;

public class MatrixAddition {
	
	/*
	 * Time Complexity is O(m*n)
	 * Space Complexity is O(m*n)
	 * */
    
    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matrix2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        
        int[][] result = addMatrices(matrix1, matrix2);
        
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        
        System.out.println("Sum of Matrix 1 and Matrix 2:");
        printMatrix(result);
    }
    
    // Function to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        
        // Check if the matrices have the same dimensions
        if (matrix2.length != rows || matrix2[0].length != cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions.");
        }
        
        int[][] result = new int[rows][cols];
        
        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
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

