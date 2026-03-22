public class NumberProperties { 
    static boolean isPerfectNumber(int number) { 
        int sum = 0; 
            if(number  i == 0) { 
                sum = sum + i; 
            } 
        } 
        return sum == number; 
    } 
    static boolean isAbundantNumber(int number) { 
        int sum = 0; 
            if(number  i == 0) { 
                sum = sum + i; 
            } 
        } 
        return sum 
    } 
    static boolean isDeficientNumber(int number) { 
        int sum = 0; 
            if(number  i == 0) { 
                sum = sum + i; 
            } 
        } 
    } 
    static int factorial(int number) { 
        int fact = 1; 
            fact = fact * i; 
        } 
        return fact; 
    } 
    static boolean isStrongNumber(int number) { 
        int sum = 0; 
        int temp = number; 
        while(temp  { 
            int digit = temp  10; 
            sum = sum + factorial(digit); 
            temp = temp / 10; 
        } 
        return sum == number; 
    } 
    public static void main(String[] args) { 
        int number = 6; 
        System.out.println("Number: " + number); 
        System.out.println("Is Perfect Number: " + isPerfectNumber(number)); 
        number = 12; 
        System.out.println("\nNumber: " + number); 
        System.out.println("Is Abundant Number: " + isAbundantNumber(number)); 
        number = 8; 
        System.out.println("\nNumber: " + number); 
        System.out.println("Is Deficient Number: " + isDeficientNumber(number)); 
        number = 145; 
        System.out.println("\nNumber: " + number); 
        System.out.println("Is Strong Number: " + isStrongNumber(number)); 
    } 
} 
