public class NumberOperations { 
    static int countDigits(int number) { 
        int count = 0; 
        int temp = number; 
        while(temp  { 
            count++; 
            temp = temp / 10; 
        } 
        return count; 
    } 
    static int[] getDigits(int number) { 
        int count = countDigits(number); 
        int[] digits = new int[count]; 
        int temp = number; 
        for(int i = count-1; i ; i--) { 
            digits[i] = temp  10; 
            temp = temp / 10; 
        } 
        return digits; 
    } 
    static int sumOfDigits(int number) { 
        int[] digits = getDigits(number); 
        int sum = 0; 
            sum = sum + digits[i]; 
        } 
        return sum; 
    } 
    static int sumOfSquares(int number) { 
        int[] digits = getDigits(number); 
        int sum = 0; 
            sum = sum + (digits[i] * digits[i]); 
        } 
        return sum; 
    } 
    static boolean isHarshadNumber(int number) { 
        int digitSum = sumOfDigits(number); 
        return number  digitSum == 0; 
    } 
    static void findDigitFrequency(int number) { 
        int[] digits = getDigits(number); 
        int[] frequency = new int[10]; 
            frequency[digits[i]]++; 
        } 
        System.out.println("Digit\tFrequency"); 
        System.out.println("-----\t---------"); 
            if(frequency[i]  { 
                System.out.println("  " + i + "\t    " + frequency[i]); 
            } 
        } 
    } 
    public static void main(String[] args) { 
        int number = 21; 
        System.out.println("Number: " + number); 
        System.out.println("Sum of digits: " + sumOfDigits(number)); 
        System.out.println("Sum of squares of digits: " + sumOfSquares(number)); 
        System.out.println("Is Harshad Number: " + isHarshadNumber(number)); 
        System.out.println(); 
        findDigitFrequency(number); 
    } 
} 
