public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;

    // Default constructor
    public Employee() {
        id = 11;
        name = "Akshata";
        age = 22;
        department = "CSE";
        salary = 25000;
    }

    // Parameterized constructor
    public Employee(int id, String name, int age, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        Employee emp1 = new Employee();
        System.out.println("Employee 1 - Default Constructor");
        System.out.println("ID: " + emp1.id);
        System.out.println("Name: " + emp1.name);
        System.out.println("Age: " + emp1.age);
        System.out.println("Department: " + emp1.department);
        System.out.println("Salary: " + emp1.salary);

        // Creating an object using the parameterized constructor
        Employee emp2 = new Employee(101, "John Doe", 30, "IT", 50000.0);
        System.out.println("\nEmployee 2 - Parameterized Constructor");
        System.out.println("ID: " + emp2.id);
        System.out.println("Name: " + emp2.name);
        System.out.println("Age: " + emp2.age);
        System.out.println("Department: " + emp2.department);
        System.out.println("Salary: " + emp2.salary);
    }
}