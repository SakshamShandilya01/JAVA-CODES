import java.util.Scanner; 
public class StudentGrades { 
    static int[][] generateScores(int numStudents) { 
        int[][] scores = new int[numStudents][3]; 
        for(int i = 0; i < numStudents; i++) { 
            scores[i][0] = (int)(Math.random() * 100) + 1; 
            scores[i][1] = (int)(Math.random() * 100) + 1; 
            scores[i][2] = (int)(Math.random() * 100) + 1; 
        } 
        return scores; 
    } 
    static double[][] calculateResults(int[][] scores) { 
        double[][] results = new double[scores.length][3]; 
        for(int i = 0; i < scores.length; i++) { 
            double total = scores[i][0] + scores[i][1] + scores[i][2]; 
            double average = total / 3; 
            double percentage = (total / 300) * 100; 
            results[i][0] = total; 
            results[i][1] = average; 
            results[i][2] = percentage; 
        } 
        return results; 
    } 
    static char getGrade(double percentage) { 
        if(percentage >= 80) return 'A'; 
        else if(percentage >= 70) return 'B'; 
        else if(percentage >= 60) return 'C'; 
        else if(percentage >= 50) return 'D'; 
        else if(percentage >= 40) return 'E'; 
        else return 'R'; 
    } 
    static void displayScorecard(int[][] scores, double[][] results) { 
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade"); 
        System.out.println("-------\t-------\t---------\t----\t-----\t-------\t----------\t-----"); 
        for(int i = 0; i < scores.length; i++) { 
            System.out.printf("d\td\t.2f\tc\n",  
                (i+1), scores[i][0], scores[i][1], scores[i][2], 
                results[i][0], results[i][1], results[i][2],  
                getGrade(results[i][2])); 
        } 
    } 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter number of students: "); 
        int numStudents = scanner.nextInt(); 
        int[][] scores = generateScores(numStudents); 
        double[][] results = calculateResults(scores); 
        displayScorecard(scores, results); 
    } 
} 
