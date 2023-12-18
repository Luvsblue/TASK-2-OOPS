public class Person {
    private String name;
    private int age;

    public Person() {
        this.age = 18;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.displayInfo();

        Person person2;
        person2 = new Person("Muthu", 23);
        person2.displayInfo();
    }
}
