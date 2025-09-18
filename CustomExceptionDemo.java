import java.util.Scanner;

public class CustomExceptionDemo {
    public static double computeSquareRoot(double num) {
        if (num < 0) {
            throw new ArithmeticException("Cannot compute square root of a negative number!");
        }
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        try {
            double result = computeSquareRoot(number);
            System.out.println("Square root is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
