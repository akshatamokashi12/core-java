public class MethodExample {
    public static void main(String[] args) {
        Addition();
        Mobile();
        DeleteNumbers();
        Contacts();
        multiple();
    }

    public static void Addition() {
        int[] Numbers = {1, 2, 3, 4, 5};
        System.out.println(" Addition:");
        for (int i = 0; i < Numbers.length; i++)  {
            System.out.println(Numbers[i]);
        }
        System.out.println();
    }

    public static void Mobile() {
        float[] temp = {10.5f, 20.7f, 30.9f};
        System.out.println("Mobile:");
        for (int i = 0; i <temp.length; i++) {
            System.out.println(temp[i]);
        }
       
	     System.out.println();
    }

    public static void DeleteNumbers() {
        String[] Fruits = {"apple", "banana", "cherry"};
        System.out.println("DeleteNumbers:");
        for (int i = 0; i < Fruits.length; i++) {
            System.out.println(Fruits[i]);
        }
        System.out.println();
    }

    public static void Contacts() {
        double[] Height = {1.2, 3.4, 5.6, 7.8};
        System.out.println(" Contacts:");
        for (int i = 0; i < Height.length; i++) {
            System.out.println(Height[i]);
        }
        System.out.println();
    }

    public static void multiple() {
        boolean[] IsItRaining = {true, false, true};
        System.out.println(" multiple:");
        for (int i = 0; i < IsItRaining.length; i++) {
            System.out.println(IsItRaining[i]);
        }
        System.out.println();
    }
}
