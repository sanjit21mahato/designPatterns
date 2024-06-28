package observer;

public class ObserverPatternClient {

	public static void main(String[] args) {

		WeatherStationObservable observerable = new WeatherStationObservable();
		MobileDisplayObserver md = new MobileDisplayObserver();
		TVDisplayObserver tvd = new TVDisplayObserver();
		observerable.add(md);
		observerable.add(tvd);
		observerable.setTemperature(30);

	}
}
