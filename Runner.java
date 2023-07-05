public class Runner {
    public static void main(String[] args) {
        // Creating 5 Television objects
        Television tv1 = new Television();
        Television tv2 = new Television();
        Television tv3 = new Television();
        Television tv4 = new Television();
        Television tv5 = new Television();

        // Accessing behaviors of Television objects
        tv1.powerOn();
        tv2.changeChannel(7);
        tv3.adjustVolume(5);
        tv4.powerOff();
        tv5.changeChannel(3);
    }
}

class Television {
    // Static variables
    static boolean isPowerOn;
    static int currentChannel;
    static int volumeLevel;

    // Static block to initialize static variables
    static {
        isPowerOn = false;
        currentChannel = 1;
        volumeLevel = 5;
    }

    // Behaviors
    public static void powerOn() {
        isPowerOn = true;
        System.out.println("TV powered on.");
    }

    public static void powerOff() {
        isPowerOn = false;
        System.out.println("TV powered off.");
    }

    public static void changeChannel(int channel) {
        currentChannel = channel;
        System.out.println("Channel changed to " + channel);
    }

    public static void adjustVolume(int level) {
        volumeLevel = level;
        System.out.println("Volume adjusted to level " + level);
    }

    public static void displayStatus() {
        System.out.println("Power: " + (isPowerOn ? "On" : "Off"));
        System.out.println("Channel: " + currentChannel);
        System.out.println("Volume: " + volumeLevel);
    }
}