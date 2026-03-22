public class EmployeeBonus { 
    static int[][] generateEmployeeData() { 
        int[][] data = new int[10][2]; 
            data[i][0] = (int)(Math.random() * 90000) + 10000; 
            data[i][1] = (int)(Math.random() * 20) + 1; 
        } 
        return data; 
    } 
    static double[][] calculateNewSalary(int[][] employeeData) { 
        double[][] result = new double[10][3]; 
