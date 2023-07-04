public class FanString {
    public static void main(String[] args) {
        String brandName = "Crompton"; // literals
        String modelNumber = "FAN123";
        String type = "Table Fan";
        String color = "White";
        String bladeMaterial = "Metal";
        String fanSpeed = "3 Speeds";
        String mountType = "Flush Mount";
        String powerSource = "Electricity";
        String airflow = "2000 CFM";
        String energyEfficiency = "Energy Star Certified";
        String motorType = new String("Induction"); // new keyword
        String controlType = new String("Remote Control");
        String dimensions = new String("52 inches");
        String noiseLevel = new String("30 dB");
        String warranty = new String("1 year");
        String oscillation = new String("Yes");
        String reversible = new String("Yes");
        String timer = new String("Programmable Timer");
        String lightKitIncluded = new String("No");
        String price = new String("$99.99");

        boolean result = brandName.contains("Cro"); // using methods
        System.out.println(result);
        String resultValue = dimensions.toLowerCase();
        System.out.println(resultValue);
        int resultedValue = fanSpeed.lastIndexOf(" 2 Speeds");
        System.out.println(resultedValue);
        int resulted = modelNumber.compareTo("FAN456");
        System.out.println(resulted);
        String returnValue = warranty.trim();
        System.out.println(returnValue);
    }
}