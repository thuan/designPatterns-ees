package uece.ees.patterns.factoryMethod;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Viewer view = new ViewerBMP();
		Image image = view.createImage();
		System.out.println("BMP");
		image = new ImageBMP();
		image.load();
		image.view();
		image.end();
		System.out.println("JPG");
		image = new ImageJPG();
		image.load();
		image.view();
		image.end();
	}

}
