import java.util.Scanner;

class PrimeNumberChecker {
    public static void main(String[] args) {
        // Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        // Initial assumption that the number is prime
        boolean isPrime = true;

        // Check if the number is less than 2, which is not prime
        if (number < 2) {
            isPrime = false;
        } else {
            // Check for factors other than 1 and itself
            for (int i = 2; i <= number / 2; i++) {
                // If number is divisible by any number between 2 and number/2, it is not prime
                if (number % i == 0) {
                    isPrime = false;
                    break; // Break out of the loop if a factor is found
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}
