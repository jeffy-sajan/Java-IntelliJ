class Employee {
    protected String name;
    protected double salary;
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class ProtectedAccessDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 90000);
        m.displayInfo();
    }
}
