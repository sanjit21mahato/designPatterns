package observer;

public class MobileDisplayObserver implements ObserverInterface{
	/*ObserverableInterface observerable;
	MobileDisplayObserver(ObserverableInterface observerable) {
		this.observerable = observerable;
	}*/

@Override
public void displayTemperature(int data) {
	System.out.println("In Mobile Display:"+data );
	
}

@Override
public void updateTemperatureChanges(ObserverableInterface observerable) {

		if (observerable instanceof WeatherStationObservable) {
			WeatherStationObservable wso = (WeatherStationObservable) observerable;
			int temp = wso.getTemperature();
			if(temp > 27){
		    	 displayTemperature(temp);
		     }

		}
		
	
}
/*@Override
	public void updateTemperatureChanges(int temp) {
	//int temp = observerable.getChangedTemperature();
     if(temp > 27){
    	 displayTemperature(temp);
     }
		
	}*/
}
