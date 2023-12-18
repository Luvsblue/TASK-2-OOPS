class PersonName {
    protected String name;
    protected int age;

    public PersonName(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends PersonName {
    public int employeeID;
    public double salary;

    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }
}