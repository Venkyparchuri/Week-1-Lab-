package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Camera implements Subject {

	
	private String cameraType;
	private List<Observer> listOfObservers = new ArrayList<Observer>();
	private boolean Available;
	
	
	
	public boolean Available() {
		return Available;
	}

	public void setAvailable(boolean Available) {
		this.Available = Available;
		if(Available==true) {
			notifyObservers();
		}
	}

	public String getCameraType() {
		return cameraType;
	}

	public void setCameraType(String cameraType) {
		this.cameraType = cameraType;
	}

	public List<Observer> getListOfObservers() {
		return listOfObservers;
	}

	public void setListOfObservers(List<Observer> listOfObservers) {
		this.listOfObservers = listOfObservers;
	}

	@Override
	public void register(Observer observer) {
		listOfObservers.add(observer);
		
	}

	@Override
	public void unregister(Observer observer) {
		listOfObservers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		
		System.out.println("Informing customers when camera is available");
		
		for(Observer observer : listOfObservers) {
			observer.updateUser(cameraType);
		}
		
	}

}
