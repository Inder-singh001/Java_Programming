import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = sumOfDigits(number);
        
        System.out.println("Sum of digits: " + sum);
        
        scanner.close();
    }
    
    // Method to calculate the sum of digits
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
