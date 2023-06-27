public class ExampleMethods {
    public static void main(String[] args) {
        ExampleMethods example = new ExampleMethods();

        int Addedvalue = example.calculateSum(5, 10);
        System.out.println("Sum: " + Addedvalue);
        int Maximumvalue = example.findMax(8, 6);
        System.out.println("Max: " +  Maximumvalue);      
        int Calculatedvalue = example.calculateFactorial(5);
        System.out.println("Factorial: " +  Calculatedvalue );      
        boolean Evenvalue = example.isEven(7);
        System.out.println("Is even? " +  Evenvalue);        
        double Averagevalue = example.calculateAverage(4, 7, 9);
        System.out.println("Average: " + Averagevalue);        
        String Gradevalue = example.getGrade(85);
        System.out.println("Grade: " + Gradevalue);     
        boolean Year = example.isLeapYear(2022);
        System.out.println("Is leap year? " + Year);      
        String Largeword = example.getLargestWord("Hello world, how are you?");
        System.out.println("Largest word: " + Largeword);      
        boolean Value = example.isPalindrome("racecar");
        System.out.println("Is palindrome? " + Value);       
        int Powervalue = example.calculatePower(2, 5);
        System.out.println("Power: " +  Powervalue );
    }

 
    public int calculateSum(int a, int b) {
        if (a > b) {
            return a + b;
        } else {
            return b - a;
        }
    }

    
    public int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    
    public int calculateFactorial(int n) {
        int factorial = 1;
        if (n == 0) {
            return factorial;
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

  
    public double calculateAverage(int a, int b, int c) {
        int sum = a + b + c;
        return (double) sum / 3;
    }


    public String getGrade(int percentage) {
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

   
    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }

   
    public String getLargestWord(String sentence) {
        String[] words = sentence.split(" ");
        String largestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > largestWord.length()) {
                largestWord = words[i];
            }
        }
        return largestWord;
    }

    
    public boolean isPalindrome(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return word.equals(reversedWord);
    }

  
    public int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}