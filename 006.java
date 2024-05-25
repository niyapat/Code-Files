// Switching selections 

// Calculator 

import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take two user input 
        System.out.print("Please, Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Please, Enter second number: ");
        double num2 = input.nextDouble();

        // Ask user to select the operation 
        System.out.println("\nSelect an operation from below menu");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = input.nextInt();

        // perform the chosen operation 
        switch(choice) {
            case 1 : //Addition
            System.out.println("Result: " + (num1 + num2));
            break;

            case 2 : //Subtraction
            System.out.println("Result: " + (num1 - num2));
            break;

            case 3: //Multiplication
            System.out.println("Result: " + (num1 * num2));
            break;

            case 4: //Division
            if (num2 != 0) {
                System.out.println("Result: "+ (num1/num2));
            }else{
                System.out.println("Error! Dividing by zero is not allowed.");
            }
            break;

            default:{
                System.out.println("Invalid selection, Please select from 1,2,3,4 option");
                break;
            }
        }
        input.close();
    }
}