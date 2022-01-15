package pattern.observer;

public class Photographer implements Observer{
	
	private Subject subject;
	private String userName;
	
	
	public Photographer(String userName) {
		this.userName = userName;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Override
	public void updateUser(String cameraType) {
		
		
		System.out.println("Dear Customer "+userName+" your requested camera "+cameraType+" is currently available");
		
	}

}
