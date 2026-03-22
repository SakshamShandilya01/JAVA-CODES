public class SumOfDigits { 
    public static void main(String[] args) { 
        int number = (int)(Math.random() * 9000) + 1000; 
        System.out.println("Random Number: " + number); 
        int temp = number; 
        int count = 0; 
        while(temp  { 
            count++; 
            temp = temp / 10; 
        } 
        System.out.println("Number of digits: " + count); 
        int[] digits = new int[count]; 
        temp = number; 
        for(int i = count-1; i ; i--) { 
            digits[i] = temp  10; 
            temp = temp / 10; 
        } 
        int sum = 0; 
            sum = sum + digits[i]; 
        } 
        System.out.println("Sum of digits: " + sum); 
    } 
} 
