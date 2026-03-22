public class FactorsProgram { 
    static int[] findFactors(int number) { 
        int count = 0; 
            if(number  i == 0) { 
                count++; 
            } 
        } 
        int[] factors = new int[count]; 
        int index = 0; 
            if(number  i == 0) { 
                factors[index] = i; 
                index++; 
            } 
        } 
        return factors; 
    } 
    static int greatestFactor(int number) { 
        int[] factors = findFactors(number); 
        return factors[factors.length - 1]; 
    } 
    static int sumOfFactors(int number) { 
        int[] factors = findFactors(number); 
        int sum = 0; 
            sum = sum + factors[i]; 
        } 
        return sum; 
    } 
    static int productOfFactors(int number) { 
        int[] factors = findFactors(number); 
        int product = 1; 
            product = product * factors[i]; 
        } 
        return product; 
    } 
    static double productOfCubesOfFactors(int number) { 
        int[] factors = findFactors(number); 
        double product = 1; 
            product = product * Math.pow(factors[i], 3); 
        } 
        return product; 
    } 
    public static void main(String[] args) { 
        int number = 12; 
        int[] factors = findFactors(number); 
        System.out.println("Factors of " + number + ":"); 
            System.out.print(factors[i] + " "); 
        } 
        System.out.println("\n\nGreatest Factor: " + greatestFactor(number)); 
        System.out.println("Sum of Factors: " + sumOfFactors(number)); 
        System.out.println("Product of Factors: " + productOfFactors(number)); 
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(number)); 
    } 
} 
