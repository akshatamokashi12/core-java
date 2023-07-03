public class Fan{
	String brand;
    String type; 
    String powerSource ;
    float bladeDiameter ;
    int speedLevels ;
    int noOfButtons ;
    boolean timer ;
    boolean remoteControl; 
    String energyEfficiencyRating; 
    float noiseLevel ;
    float weight ;
    String color ;
    String material; 
    float height ;
    float width ;
    float depth ;
    int warranty ; 
    int price ;
    boolean availability; 
	

	
	public Fan(String type, int price , int warranty , String color)
		{
			this.type = type;
			this.price = price;
			this.warranty  = warranty ;
			this.color = color;
		}
		
		public static void rotation()
		{
		}
		
		public static void airFlowGeneration()
		{
		}
		
		public static void speedControl()
		{
		}
		
		public static void oscillation()
		{
		}
		
		public static void noiseProduction()
		{
		}
		
		public static void airDirection()
		{
		}
		
		public static void powerSource()
		{
		}
		
		public static void blendDesign()
		{
		}
		
		public static void coolingCapacity()
		{
		}
		
		public static void energyConsumption()
		{
		}
		
		public static void main(String[] args)
		{
			Fan fan = new Fan("TableFan" , 2000 , 3 , "Black");
			System.out.println(fan);
			System.out.println(fan.type);
			System.out.println(fan.price);
			System.out.println(fan.warranty );
			System.out.println(fan.color);
		}
	
}

		
	



			
		
	
	
	
		
		
		

