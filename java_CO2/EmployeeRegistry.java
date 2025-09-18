public class EmployeeRegistry {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee(101, "Alice", 50000.0);
        employees[1] = new Employee(102, "Bob", 60000.0);
        employees[2] = new Employee(103, "Charlie", 55000.0);

        System.out.println("Employee Records:");
        for (Employee emp : employees) {
            emp.displayEmployee();
        }

        System.out.println("After Salary Update for Alice:");
        employees[0].updateSalary(55000.0);
        employees[0].displayEmployee();

        System.out.println("After Promotion for Bob:");
        Employee.promote(employees[1], 5000.0);
        employees[1].displayEmployee();
    }
}
