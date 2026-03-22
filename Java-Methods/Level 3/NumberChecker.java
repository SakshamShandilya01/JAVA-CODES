public class NumberChecker { 
    static boolean isPrime(int number) { 
            return false; 
        } 
            if(number  i == 0) { 
                return false; 
            } 
        } 
        return true; 
    } 
    static boolean isNeon(int number) { 
        int square = number * number; 
        int sum = 0; 
        while(square  { 
            sum = sum + (square  10); 
            square = square / 10; 
        } 
        return sum == number; 
    } 
    static boolean isSpyNumber(int number) { 
        int sum = 0; 
        int product = 1; 
        int temp = number; 
        while(temp  { 
            int digit = temp  10; 
            sum = sum + digit; 
            product = product * digit; 
            temp = temp / 10; 
        } 
        return sum == product; 
    } 
    static boolean isAutomorphic(int number) { 
        int square = number * number; 
        int temp = number; 
        int divisor = 1; 
        while(temp  { 
            divisor = divisor * 10; 
            temp = temp / 10; 
        } 
        return square  divisor == number; 
    } 
    static boolean isBuzzNumber(int number) { 
        return (number  10 == 7); 
    } 
    public static void main(String[] args) { 
        int number = 5; 
        System.out.println("Number: " + number); 
        System.out.println("Is Prime: " + isPrime(number)); 
        System.out.println("Is Neon: " + isNeon(number)); 
        number = 22; 
        System.out.println("\nNumber: " + number); 
        System.out.println("Is Spy Number: " + isSpyNumber(number)); 
        number = 5; 
        System.out.println("\nNumber: " + number); 
        System.out.println("Is Automorphic: " + isAutomorphic(number)); 
        number = 14; 
        System.out.println("\nNumber: " + number); 
        System.out.println("Is Buzz Number: " + isBuzzNumber(number)); 
    } 
} 
