package factory;

public class BikeFactory {
	//static Bike bike=null;
	public static Bike getInstance(String bikeType) {
		/*if("hero".equalsIgnoreCase(bikeType)){
			bike= new HeroBike();
		}else if("tvs".equalsIgnoreCase(bikeType)){
			bike = new TVSBike();
		}
		return bike;*/
		
		switch(bikeType) {
		case "hero":
			return new HeroBike();
		case "tvs":
			return new TVSBike();
		default:
			return null;
		
	}
		
 }
	
}
	

