package pattern.decorator;

public class HDCamera extends CameraDecorator {

	public HDCamera(Camera printer) {
		super(printer);
	}
	
	@Override
	public void addFeatures() {
			super.addFeatures();
			System.out.println("Attaching HD Lens to the basic camera");
	}

}
