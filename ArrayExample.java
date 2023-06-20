public class ArrayExample {
    public static void main(String[] args) {
       
        int[] ages = {25, 30, 35, 40, 45};
		System.out.println(ages[0]);
	    String[] names = {"John", "Alice", "Michael", "Sarah", "David"};
	    double[] salaries = {2500.50, 3000.75, 3500.25, 4000.80, 4500.90};
		System.out.println("Salaries[3]");
		boolean[] isMarried = {false, true, true, false, true};
		String[] cities = {"New York", "London", "Paris", "Tokyo", "Sydney"};
		int[] scores = {85, 92, 78, 90, 87};
		System.out.println("Scores [1]" );
		String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Mango"};
        double[] weights = {65.2, 70.5, 68.7, 72.0, 67.9};
        System.out.println("Weights[2] ");
        boolean[] isEmployed = {true, false, true, true, false};
        String[] countries = {"USA", "UK", "France", "Japan", "Australia"};

        
        int[] newNumbers = new int[]{1, 2, 3, 4, 5};
		float[] newFloats = new float[]{1.5f, 2.7f, 3.14f, 4.8f, 5.2f};
		char[] newCharacters = new char[]{'a', 'b', 'c', 'd', 'e'};
		boolean[] newBooleans = new boolean[]{true, false, true, false, true};
        String[] newStrings = new String[]{"apple", "banana", "orange", "grape", "kiwi"};
        Integer[] newIntegers = new Integer[]{1, 2, 3, 4, 5};
        double[] newDoubles = new double[]{1.5, 2.7, 3.14, 4.8, 5.2};
        byte[] newBytes = new byte[]{1, 2, 3, 4, 5};
        long[] newLongs = new long[]{1000000000L, 2000000000L, 3000000000L, 4000000000L, 5000000000L};
		
         
	        for (int i = 0; i < 5; i++) {
                       salaries[i] *= 1.1;  
               }
		for (int i = 0; i < 5; i++) {
			ages[i] += 5; 
		}
		for (int i = 0; i < 5; i++) {
			scores[i] -= 5;
		}
		for (int i = 0; i < 5; i++) {
			weights[i] += 2.5;
		}
		
      
        
        
    }
}
