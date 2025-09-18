import java.util.Scanner;

interface ShapeInterface {
    void draw();
}

class Circle2 implements ShapeInterface {
    public void draw() { System.out.println("Drawing circle"); }
}

class Square2 implements ShapeInterface {
    public void draw() { System.out.println("Drawing square"); }
}

class Triangle2 implements ShapeInterface {
    public void draw() { System.out.println("Drawing triangle"); }
}

class ShapeFactory {
    public static ShapeInterface getShape(String type) {
        switch (type.toLowerCase()) {
            case "circle": return new Circle2();
            case "square": return new Square2();
            case "triangle": return new Triangle2();
            default: return null;
        }
    }
}

public class ShapeFactoryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shape to draw (circle/square/triangle): ");
        String input = sc.nextLine();

        ShapeInterface shape = ShapeFactory.getShape(input);
        if (shape != null) shape.draw();
        else System.out.println("Invalid shape");
    }
}
