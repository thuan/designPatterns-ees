package uece.ees.patterns.templateMethod;

public class Convert {

	protected ConvertTemplate template;

	public Convert(ConvertTemplate template) {
		super();
		this.template = template;
	}
	
	protected void convert() {
		template.convert();
	}

}
