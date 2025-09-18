final class FinalClass {
    public void show() {
        System.out.println("Inside FinalClass");
    }
}

class Parent {
    public final void display() {
        System.out.println("Final method - cannot be overridden");
    }
}

class Child extends Parent {
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
    }
}
