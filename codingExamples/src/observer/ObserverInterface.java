package observer;

public interface ObserverInterface {

	void displayTemperature(int data);
	void updateTemperatureChanges(ObserverableInterface observerable );
	/*void updateTemperatureChanges(int temperature );*/
}
