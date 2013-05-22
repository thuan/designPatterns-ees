package uece.ees.patterns.factoryMethod;

public class ImageBMP implements Image {

	@Override
	public void load() {
		System.out.println("loading BMP image");
	}

	@Override
	public void view() {
		System.out.println("preview BMP image in 20 seconds..");
	}

	@Override
	public void end() {
		System.out.println("end process");
		System.out.println("======");
	}

}
