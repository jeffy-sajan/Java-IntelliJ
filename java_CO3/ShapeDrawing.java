import java.util.Scanner;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing circle"); }
}

class Square extends Shape {
    void draw() { System.out.println("Drawing square"); }
}

class Triangle extends Shape {
    void draw() { System.out.println("Drawing triangle"); }
}

public class ShapeDrawing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shape (circle, square, triangle): ");
        String choice = sc.nextLine();

        Shape s;
        switch (choice.toLowerCase()) {
            case "circle": s = new Circle(); break;
            case "square": s = new Square(); break;
            case "triangle": s = new Triangle(); break;
            default: System.out.println("Invalid shape"); return;
        }
        s.draw();
    }
}
