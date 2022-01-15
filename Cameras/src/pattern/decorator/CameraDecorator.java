package pattern.decorator;

public class CameraDecorator implements Camera {

	private Camera camera;
	
	
	
	public CameraDecorator(Camera camera) {
		super();
		this.camera = camera;
	}

	@Override
	public void addFeatures() {
		camera.addFeatures();

	}

}
