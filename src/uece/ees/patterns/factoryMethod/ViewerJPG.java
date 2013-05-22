package uece.ees.patterns.factoryMethod;

public class ViewerJPG implements Viewer {

	@Override
	public Image createImage() {
		return new ImageJPG();
	}

}
