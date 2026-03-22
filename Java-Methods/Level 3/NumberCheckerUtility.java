public class NumberCheckerUtility { 
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
    static boolean isDuckNumber(int number) { 
        int[] digits = getDigits(number); 
        boolean hasZero = false; 
        boolean hasNonZero = false; 
            if(digits[i] == 0) { 
                hasZero = true; 
            } 
            if(digits[i] != 0) { 
                hasNonZero = true; 
            } 
        } 
    } 
    static boolean isArmstrongNumber(int number) { 
        int[] digits = getDigits(number); 
        int power = digits.length; 
        int sum = 0; 
            sum = sum + (int)Math.pow(digits[i], power); 
        } 
        return sum == number; 
    } 
    static void findLargestAndSecondLargest(int number) { 
        int[] digits = getDigits(number); 
        int largest = digits[0]; 
        int secondLargest = digits[0]; 
            if(digits[i]  { 
                largest = digits[i]; 
            } 
        } 
        secondLargest = digits[0]; 
                secondLargest = digits[i]; 
            } 
        } 
        System.out.println("Largest digit: " + largest); 
        System.out.println("Second largest digit: " + secondLargest); 
    } 
    static void findSmallestAndSecondSmallest(int number) { 
        int[] digits = getDigits(number); 
        int smallest = digits[0]; 
        int secondSmallest = digits[0]; 
                smallest = digits[i]; 
            } 
        } 
        secondSmallest = 9; 
                secondSmallest = digits[i]; 
            } 
        } 
        System.out.println("Smallest digit: " + smallest); 
        System.out.println("Second smallest digit: " + secondSmallest); 
    } 
    public static void main(String[] args) { 
        int number = 153; 
        System.out.println("Number: " + number); 
        System.out.println("Count of digits: " + countDigits(number)); 
        int[] digits = getDigits(number); 
        System.out.print("Digits: "); 
            System.out.print(digits[i] + " "); 
        } 
        System.out.println("\n\nIs Duck Number: " + isDuckNumber(number)); 
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number)); 
        System.out.println(); 
        findLargestAndSecondLargest(number); 
        findSmallestAndSecondSmallest(number); 
    } 
} 
