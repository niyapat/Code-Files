// Area of a circle with User Input

// Import the Scanner class from the java.util package
import java.util.Scanner;

// Define a class named CircleWithInput
class CircleWithInput {
    public static void main(String[] args) {
        //  Create a Scanner object to read input from the standard input stream (console)
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle

        System.out.println("Enter the radius of the circle: ");

      // Read the radius value entered by the user and store it in a double variable

        double radius = sc.nextDouble();

        // Calculation of Area of A circle 

        double area = (22/7)*radius*radius;

        System.out.println("Circle with the radius is: " + area);

        // Close the scanner object to prevent resource leaks

        sc.close();

    }
}