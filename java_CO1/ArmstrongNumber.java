import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n, sum = 0;
        int digits = String.valueOf(n).length(); // count digits

        while(n != 0) {
            int d = n % 10;
            sum += Math.pow(d, digits);
            n /= 10;
        }

        if(sum == original)
            System.out.println(original + " is an Armstrong Number");
        else
            System.out.println(original + " is Not an Armstrong Number");
    }
}
