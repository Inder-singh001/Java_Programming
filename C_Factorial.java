import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        long factorial = calculateFactorial(number);
        
        System.out.println("Factorial of " + number + " is: " + factorial);
        
        scanner.close();
    }
    
    // Method to calculate the factorial of a number
    public static long calculateFactorial(int number) {
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
