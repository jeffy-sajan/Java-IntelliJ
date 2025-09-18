import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        float p = sc.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        float r = sc.nextFloat();
        System.out.print("Enter Time (in years): ");
        float t = sc.nextFloat();

        float si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }
}
