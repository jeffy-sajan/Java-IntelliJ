import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p, r, t, si;

        System.out.print("Enter Principal amount: ");
        p = sc.nextFloat();

        System.out.print("Enter Interest Rate: ");
        r = sc.nextFloat();

        System.out.print("Enter Time Period: ");
        t = sc.nextFloat();

        si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }
}
