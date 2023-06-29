public class MyChair {
    private int number;
    private String name;
    private double price;
    private boolean available;
    private char category;

    // Default constructor
    public MyChair() {
        number = 0;
        name = "";
        price = 0.0;
        available = false;
        category = ' ';
    }

    // Parameterized constructor
    public MyChair(int number, String name, double price, boolean available, char category) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.available = available;
        this.category = category;
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        MyClass obj1 = new MyClass();
        
        // Creating an object using the parameterized constructor
        MyClass obj2 = new MyClass(1, "Product 1", 9.99, true, 'A');
        
        // Accessing the variables of obj1
        System.out.println("Object 1:");
        System.out.println("Number: " + obj1.number);
        System.out.println("Name: " + obj1.name);
        System.out.println("Price: " + obj1.price);
        System.out.println("Available: " + obj1.available);
        System.out.println("Category: " + obj1.category);
        
        // Accessing the variables of obj2
        System.out.println("\nObject 2:");
        System.out.println("Number: " + obj2.number);
        System.out.println("Name: " + obj2.name);
        System.out.println("Price: " + obj2.price);
        System.out.println("Available: " + obj2.available);
        System.out.println("Category: " + obj2.category);
    }
}