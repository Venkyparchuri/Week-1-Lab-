package pattern.observer;

public class TestMain {

	public static void main(String[] args) {
		
		Photographer p1 = new Photographer("Henry");
		Photographer p2 = new Photographer("David");
		Photographer p3 = new Photographer("Michael");
		
		
		Camera cam = new Camera();
		cam.setCameraType("Shutter Camera");
		cam.setAvailable(false);
		
		cam.register(p1);
		cam.register(p2);
		cam.register(p3);
		
		cam.setAvailable(true);
		
		cam.unregister(p2);
		cam.setAvailable(true);
	}

}
