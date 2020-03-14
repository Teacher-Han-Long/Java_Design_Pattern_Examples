import java.util.ArrayList;
import java.util.List;

public class ScoreBoard implements Board {
	
	private List<Observer> observers;
	private String message;
	private boolean changed;
	
	public ScoreBoard () {
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer obj) {
		if (obj == null) {
			throw new NullPointerException("null observer registered");
		}
		if (!observers.contains(obj)) {
			observers.add(obj);
		}
	}
	
	@Override
	public void unRegister(Observer observer) {
		observers.remove(observer);
	}
	
	@Override
	public void notifyObserver() {
		if (!changed) {
			return;
		}
		else {
			this.changed = false;
			for (Observer observer: this.observers) {
				observer.update();
			}
		}
	}
	
	public Object getUpdate(Observer obj) {
		return this.message;
	}
	
	public void postMessage(String msg) {
		System.out.println("Message posted: " + msg);
		this.message = msg;
		this.changed = true;
		notifyObserver();
	}
	
}