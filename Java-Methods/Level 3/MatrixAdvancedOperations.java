public class MatrixAdvancedOperations { 
    static int[][] createRandomMatrix(int rows, int columns) { 
        int[][] matrix = new int[rows][columns]; 
        for(int i = 0; i < rows; i++) { 
            for(int j = 0; j < columns; j++) { 
                matrix[i][j] = (int)(Math.random() * 10) + 1; 
            } 
        } 
        return matrix; 
    } 
    static int[][] transposeMatrix(int[][] matrix) { 
        int rows = matrix.length; 
        int cols = matrix[0].length; 
        int[][] transpose = new int[cols][rows]; 
        for(int i = 0; i < rows; i++) { 
            for(int j = 0; j < cols; j++) { 
                transpose[j][i] = matrix[i][j]; 
            } 
        } 
        return transpose; 
    } 
    static int determinant2x2(int[][] matrix) { 
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]); 
    } 
    static int determinant3x3(int[][] matrix) { 
        int a = matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1])); 
        int b = matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0])); 
        int c = matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0])); 
        return a - b + c; 
    } 
    static double[][] inverse2x2(int[][] matrix) { 
        int det = determinant2x2(matrix); 
        if(det == 0) { 
            System.out.println("Inverse does not exist (determinant = 0)"); 
            return null; 
        } 
        double[][] inverse = new double[2][2]; 
        inverse[0][0] = (double)matrix[1][1] / det; 
        inverse[0][1] = (double)(-matrix[0][1]) / det; 
        inverse[1][0] = (double)(-matrix[1][0]) / det; 
        inverse[1][1] = (double)matrix[0][0] / det; 
        return inverse; 
    } 
    static void displayMatrix(int[][] matrix) { 
        for(int i = 0; i < matrix.length; i++) { 
            for(int j = 0; j < matrix[i].length; j++) { 
                System.out.print(matrix[i][j] + "\t"); 
            } 
            System.out.println(); 
        } 
    } 
    static void displayDoubleMatrix(double[][] matrix) { 
        for(int i = 0; i < matrix.length; i++) { 
            for(int j = 0; j < matrix[i].length; j++) { 
                System.out.printf(".2f\t", matrix[i][j]); 
            } 
            System.out.println(); 
        } 
    } 
    public static void main(String[] args) { 
        System.out.println("2x2 Matrix Operations"); 
        System.out.println("---------------------"); 
        int[][] matrix2x2 = createRandomMatrix(2, 2); 
        System.out.println("Original Matrix:"); 
        displayMatrix(matrix2x2); 
        System.out.println("\nTranspose:"); 
        int[][] transpose2x2 = transposeMatrix(matrix2x2); 
        displayMatrix(transpose2x2); 
        System.out.println("\nDeterminant: " + determinant2x2(matrix2x2)); 
        System.out.println("\nInverse:"); 
        double[][] inverse2x2 = inverse2x2(matrix2x2); 
        if(inverse2x2 != null) { 
            displayDoubleMatrix(inverse2x2); 
        } 
        System.out.println("\n\n3x3 Matrix Operations"); 
        System.out.println("---------------------"); 
        int[][] matrix3x3 = createRandomMatrix(3, 3); 
        System.out.println("Original Matrix:"); 
        displayMatrix(matrix3x3); 
        System.out.println("\nTranspose:"); 
        int[][] transpose3x3 = transposeMatrix(matrix3x3); 
        displayMatrix(transpose3x3); 
        System.out.println("\nDeterminant: " + determinant3x3(matrix3x3)); 
    } 
} 
