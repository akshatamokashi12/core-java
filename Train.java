public class Train {
    // Static variables
    public static int totalTrains;
    public static String trainCompany;
    public static double averageSpeed;
    public static int maxPassengers;
    public static boolean isExpressTrain;

    // Non-static variables
    public int trainNumber;
    public String trainName;
    public double currentSpeed;
    public int currentPassengers;
    public boolean isRunning;

    // Constructor
    public Train(int trainNumber, String trainName) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.currentSpeed = 25;
        this.currentPassengers = 40;
        this.isRunning = false;
        
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating five train objects
        Train train1 = new Train(1, "Chennai Express");
        Train train2 = new Train(2, "BGM Express");
        Train train3 = new Train(3, "Express 3");
        Train train4 = new Train(4, "Local 4");
        Train train5 = new Train(5, "Express 5");

        // Printing the number of total trains
        System.out.println("Total Trains: " + totalTrains);
		System.out.println("trainCompany" + trainCompany);
		System.out.println("maxPassengers " + maxPassengers);
    }
}