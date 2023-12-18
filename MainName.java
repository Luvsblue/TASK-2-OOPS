public class MainName {
    public static void main(String[] args) {
        Employee employee = new Employee("Muthu", 23, 1234, 50000.0);

        System.out.println("Employee Name: " + employee.name);
        System.out.println("Employee Age: " + employee.age);
        System.out.println("Employee ID: " + employee.employeeID);
        System.out.println("Employee Salary: " + employee.salary);
    }
}