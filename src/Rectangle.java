import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, breadth, area, perimeter;

        System.out.print("Enter length: ");
        length = sc.nextInt();

        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();

        area = length * breadth;
        perimeter = 2 * (length + breadth);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
