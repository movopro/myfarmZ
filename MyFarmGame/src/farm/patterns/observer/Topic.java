package fmi;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private String message;
	
	@Override
	public void register(Observer obs) {
		this.observers.add(obs);
		obs.setSubject(this);
	}

	@Override
	public void unregister(Observer obs) {
		this.observers.remove(obs);
	}

	@Override
	public void notifyObservers() {
		for (Observer obs: this.observers) {
			obs.update();
		}
	}

	@Override
	public Object getUpdate(Observer obs) {
		return this.message;
	}
	
	public void postMessage(String message) {
		this.message = message;
		notifyObservers();
	}

}
