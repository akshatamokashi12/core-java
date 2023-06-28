public class MyClass {
    
    // Method 1: Calculate the sum of two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method 2: Find the maximum value between two integers
    public int findMax(int a, int b) {
        return Math.max(a, b);
    }
    
    // Method 3: Print a given message
    public void printMessage(String message) {
        System.out.println(message);
    }
    
    // Method 4: Calculate the difference between two integers
    public int subtract(int a, int b) {
        return a - b;
    }
    
    // Method 5: Find the minimum value between two integers
    public int findMin(int a, int b) {
        return Math.min(a, b);
    }
    
    // Method 6: Check if a number is even
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
    
    // Method 7: Calculate the product of two integers
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Method 8: Calculate the average of three integers
    public double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
    
    // Method 9: Check if a number is positive
    public boolean isPositive(int num) {
        return num > 0;
    }
    
    // Method 10: Calculate the division of two numbers
    public double divide(double dividend, double divisor) {
        return dividend / divisor;
    }
    
    // Method 11: Concatenate two strings
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }
    
    // Method 12: Check if a string is empty
    public boolean isEmpty(String str) {
        return str.isEmpty();
    }
    
    // Method 13: Calculate the square of a number
    public int square(int num) {
        return num * num;
    }
    
    // Method 14: Calculate the cube of a number
    public int cube(int num) {
        return num * num * num;
    }
    
    // Method 15: Check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Method 16: Convert a string to uppercase
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
    
    // Method 17: Calculate the length of a string
    public int calculateLength(String str) {
        return str.length();
    }
    
    // Method 18: Check if a number is negative
    public boolean isNegative(int num) {
        return num < 0;
    }
    
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        
        // Method 1: Calculate the sum of two integers
        int sum = myObject.add(5, 3);
        System.out.println("Sum: " + sum);
        
        // Method 2: Find the maximum value between two integers
        int max = myObject.findMax(8, 4);
        System.out.println("Max: " + max);
        
        // Method 3: Print a given message
        myObject.printMessage("Hello, World!");
        
        // Method 4: Calculate the difference between two integers
        int diff = myObject.subtract(7, 2);
        System.out.println("Difference: " + diff);
        
        // Method 5: Find the minimum value between two integers
        int min = myObject.findMin(9, 2);
        System.out.println("Min: " + min);
        
        // Method 6: Check if a number is even
        boolean isEven = myObject.isEven(6);
        System.out.println("Is even? " + isEven);
        
        // Method 7: Calculate the product of two integers
        int product = myObject.multiply(4, 5);
        System.out.println("Product: " + product);
        
        // Method 8: Calculate the average of three integers
        double average = myObject.calculateAverage(3, 6, 9);
        System.out.println("Average: " + average);
        
        // Method 9: Check if a number is positive
        boolean isPositive = myObject.isPositive(-2);
        System.out.println("Is positive? " + isPositive);
        
        // Method 10: Calculate the division of two numbers
        double division = myObject.divide(10.0, 2.0);
        System.out.println("Division: " + division);
        
        // Method 11: Concatenate two strings
        String concatenatedStr = myObject.concatenate("Hello", "World");
        System.out.println("Concatenated String: " + concatenatedStr);
        
        // Method 12: Check if a string is empty
        boolean isEmpty = myObject.isEmpty("");
        System.out.println("Is empty? " + isEmpty);
        
        // Method 13: Calculate the square of a number
        int squared = myObject.square(4);
        System.out.println("Square: " + squared);
        
        // Method 14: Calculate the cube of a number
        int cubed = myObject.cube(3);
        System.out.println("Cube: " + cubed);
        
        // Method 15: Check if a number is prime
        boolean isPrime = myObject.isPrime(7);
        System.out.println("Is prime? " + isPrime);
        
        // Method 16: Convert a string to uppercase
        String uppercaseStr = myObject.toUpperCase("hello");
        System.out.println("Uppercase String: " + uppercaseStr);
        
        // Method 17: Calculate the length of a string
        int length = myObject.calculateLength("Java");
        System.out.println("Length: " + length);
        
        // Method 18: Check if a number is negative
        boolean isNegative = myObject.isNegative(-5);
        System.out.println("Is negative? " + isNegative);
    }
}