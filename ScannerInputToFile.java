import java.io.*;
import java.util.Scanner;

public class ScannerInputToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter line " + (i + 1) + ": ");
            lines[i] = sc.nextLine();
        }

        try (PrintWriter writer = new PrintWriter("user_input.txt")) {
            for (String line : lines) {
                writer.println(line);
            }
            System.out.println("Wrote input to user_input.txt");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        System.out.println("Reading file contents:");
        try (BufferedReader br = new BufferedReader(new FileReader("user_input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
