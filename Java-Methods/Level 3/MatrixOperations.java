public class MatrixOperations { 
    static int[][] createRandomMatrix(int rows, int columns) { 
        int[][] matrix = new int[rows][columns]; 
        for(int i = 0; i < rows; i++) { 
            for(int j = 0; j < columns; j++) { 
                matrix[i][j] = (int)(Math.random() * 10) + 1; 
            } 
        } 
        return matrix; 
    } 
    static int[][] addMatrices(int[][] matrix1, int[][] matrix2) { 
        int rows = matrix1.length; 
        int cols = matrix1[0].length; 
        int[][] result = new int[rows][cols]; 
        for(int i = 0; i < rows; i++) { 
            for(int j = 0; j < cols; j++) { 
                result[i][j] = matrix1[i][j] + matrix2[i][j]; 
            } 
        } 
        return result; 
    } 
    static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) { 
        int rows = matrix1.length; 
        int cols = matrix1[0].length; 
        int[][] result = new int[rows][cols]; 
        for(int i = 0; i < rows; i++) { 
            for(int j = 0; j < cols; j++) { 
                result[i][j] = matrix1[i][j] - matrix2[i][j]; 
            } 
        } 
        return result; 
    } 
    static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) { 
        int rows1 = matrix1.length; 
        int cols1 = matrix1[0].length; 
        int cols2 = matrix2[0].length; 
        int[][] result = new int[rows1][cols2]; 
        for(int i = 0; i < rows1; i++) { 
            for(int j = 0; j < cols2; j++) { 
                for(int k = 0; k < cols1; k++) { 
                    result[i][j] = result[i][j] + (matrix1[i][k] * matrix2[k][j]); 
                } 
            } 
        } 
        return result; 
    } 
    static void displayMatrix(int[][] matrix) { 
        for(int i = 0; i < matrix.length; i++) { 
            for(int j = 0; j < matrix[i].length; j++) { 
                System.out.print(matrix[i][j] + "\t"); 
            } 
            System.out.println(); 
        } 
    } 
    public static void main(String[] args) { 
        System.out.println("Matrix 1 (3x3):"); 
        int[][] matrix1 = createRandomMatrix(3, 3); 
        displayMatrix(matrix1); 
        System.out.println("\nMatrix 2 (3x3):"); 
        int[][] matrix2 = createRandomMatrix(3, 3); 
        displayMatrix(matrix2); 
        System.out.println("\nMatrix Addition:"); 
        int[][] addition = addMatrices(matrix1, matrix2); 
        displayMatrix(addition); 
        System.out.println("\nMatrix Subtraction:"); 
        int[][] subtraction = subtractMatrices(matrix1, matrix2); 
        displayMatrix(subtraction); 
        System.out.println("\nMatrix Multiplication:"); 
        int[][] multiplication = multiplyMatrices(matrix1, matrix2); 
        displayMatrix(multiplication); 
    } 
} 
