import java.io.*;

public class FileReadDemo {
    public static void readFile() throws IOException {
        System.out.println("Trying to open 'data.txt'");
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line = br.readLine();
        System.out.println("File contains: " + line);
        br.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}
