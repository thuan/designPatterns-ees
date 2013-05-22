package uece.ees.patterns.factoryMethod;

public class ImageJPG implements Image {

	@Override
	public void load() {
		System.out.println("loading jpg image");
	}

	@Override
	public void view() {
		System.out.println("preview JPG image in 20 seconds..");
	}

	@Override
	public void end() {
		System.out.println("end process");
		System.out.println("======");
	}

}
