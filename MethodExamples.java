public class MethodExamples {
    
    public int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        return average;
    }
		
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int getLargestElement(int[] array) {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }


    public int findMaxValueIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public char getFirstCharacter(String str) {
        return str.charAt(0);
    }

    public String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public boolean checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Calculator methods = new Calculator();
        
        int sumResult = methods.calculateSum(5, 3);
        System.out.println("Sum: " + sumResult);

        double[] numbers = { 2.5, 3.5, 4.0, 2.0 };
        double averageResult = methods.calculateAverage(numbers);
        System.out.println("Average: " + averageResult);

        boolean isPrimeResult = methods.isPrime(17);
        System.out.println("Is Prime: " + isPrimeResult);

        int[] intArray = { 5, 2, 9, 1, 7 };
        int largestElementResult = methods.getLargestElement(intArray);
        System.out.println("Largest Element: " + largestElementResult);

        int[] intArray2 = { 10, 5, 8, 12, 6 };
        int maxIndexResult = methods.findMaxValueIndex(intArray2);
        System.out.println("Max Value Index: " + maxIndexResult);

        long factorialResult = methods.calculateFactorial(5);
        System.out.println("Factorial: " + factorialResult);

        char firstCharacterResult = methods.getFirstCharacter("Hello");
        System.out.println("First Character: " + firstCharacterResult);

        String reversedStringResult = methods.reverseString("Hello");
        System.out.println("Reversed String: " + reversedStringResult);

        boolean isLeapYearResult = methods.checkLeapYear(2024);
        System.out.println("Is Leap Year: " + isLeapYearResult);
    }
}