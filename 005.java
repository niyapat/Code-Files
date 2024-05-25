import java.util.Scanner;
class ValidVoter {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your Age: ");
    int age = input.nextInt();

    if (age >= 18 && age <= 120) {
        System.out.println("You are eligible to vote");
    }else if (age > 120) {
        System.out.println("Sorry, please enter valid age");
    }else{
        System.out.println("Please grow up");
    }
    input.close();
}
}