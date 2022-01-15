package pattern.decorator;

public class FocusBackground extends CameraDecorator {

	public FocusBackground(Camera printer) {
		super(printer);
		}
	@Override
	public void addFeatures() {
			super.addFeatures();
			System.out.println("Implementing background focus feature to the basic camera");
	}
}
