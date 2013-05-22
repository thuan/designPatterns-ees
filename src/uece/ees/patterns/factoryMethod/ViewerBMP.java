package uece.ees.patterns.factoryMethod;

public class ViewerBMP implements Viewer {

	@Override
	public Image createImage() {
		return new ImageBMP();
	}

}
