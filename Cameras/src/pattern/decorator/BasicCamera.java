package pattern.decorator;

public class BasicCamera implements Camera {

	@Override
	public void addFeatures() {
		System.out.println("Basic Camera with limited features");
		
	}

}
