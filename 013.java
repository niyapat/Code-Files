public class ArmstrongNumbers {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000; // You can adjust the range as needed
        
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        
        // Loop through the range of numbers and check if each number is Armstrong
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) { // If the number is Armstrong, print it
                System.out.println(i);
            }
        }
    }
    
    // Function to check if a number is Armstrong or not
    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0, n = 0;

        originalNum = num;

        // Count number of digits in the number
        for (; originalNum != 0; originalNum /= 10, ++n);

        originalNum = num;

        // Calculate Armstrong number
        for (; originalNum != 0; originalNum /= 10) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n); // Add each digit raised to the power of the number of digits
        }

        // Check if the number is Armstrong
        if (result == num) {
            return true; // Return true if the number is Armstrong
        }
        return false; // Return false if the number is not Armstrong
    }
}
