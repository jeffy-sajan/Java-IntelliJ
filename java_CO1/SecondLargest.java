import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int val : arr) {
            if(val > largest) {
                second = largest;
                largest = val;
            } else if(val > second && val != largest) {
                second = val;
            }
        }

        if(second == Integer.MIN_VALUE)
            System.out.println("No second largest element (all values same).");
        else
            System.out.println("Second Largest = " + second);
    }
}
