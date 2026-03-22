public class OTPGenerator { 
    static int generateOTP() { 
        return (int)(Math.random() * 900000) + 100000; 
    } 
    static boolean areAllUnique(int[] otps) { 
                if(otps[i] == otps[j]) { 
                    return false; 
                } 
            } 
        } 
        return true; 
    } 
    public static void main(String[] args) { 
        int[] otpArray = new int[10]; 
        System.out.println("Generating 10 OTPs:"); 
            otpArray[i] = generateOTP(); 
            System.out.println("OTP " + (i+1) + ": " + otpArray[i]); 
        } 
        if(areAllUnique(otpArray)) { 
            System.out.println("\nAll OTPs are unique!"); 
        } else { 
            System.out.println("\nSome OTPs are repeated!"); 
        } 
    } 
} 
