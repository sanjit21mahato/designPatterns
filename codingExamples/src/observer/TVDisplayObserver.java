package observer;

public class TVDisplayObserver implements ObserverInterface{
	//ObserverableInterface observerable;
	/*public TVDisplayObserver(ObserverableInterface observerable) {
		this.observerable =observerable;
	}*/
	
	@Override
	public void displayTemperature(int data) {
		System.out.println("In TV Display:"+data);
		
	}
	
	@Override
	public void updateTemperatureChanges(ObserverableInterface observerable) {
		// TODO Auto-generated method stub
		
	}
	
	/*@Override
	public void updateTemperatureChanges(int temp) {
		//int temp=observerable.getChangedTemperature();
		if(temp>27) {
			displayTemperature(temp);
		}
	
	}*/
}
