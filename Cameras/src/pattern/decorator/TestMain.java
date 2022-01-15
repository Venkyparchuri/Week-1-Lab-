package pattern.decorator;

public class TestMain {

	public static void main(String[] args) {
				//Assemble Basic printer
				System.out.println("============================================================");
				System.out.println("Initially no feature added");
				System.out.println("============================================================");
				Camera basicCamera = new BasicCamera();
				basicCamera.addFeatures();
				
				//Decorate Basic Printer with color Feature
				System.out.println("\n============================================================");
				System.out.println("Adding HD lens to camera at runtime execution");
				System.out.println("============================================================");
				Camera hdCam = new HDCamera(new BasicCamera());
				hdCam.addFeatures();
				
				//Decorate Basic Printer with Color and Laser feature
				System.out.println("\n============================================================");
				System.out.println("Adding HD lens and Focus feature both to camera at runtime execution");
				System.out.println("============================================================");
				Camera focusHdCamera = new FocusBackground(new HDCamera(new BasicCamera()));
				focusHdCamera.addFeatures();

	}

}
