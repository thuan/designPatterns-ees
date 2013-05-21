package uece.ees.patterns.templateMethod;

public class ConvertToRevert extends ConvertTemplate {

	@Override
	void converter(String string) {
		System.out.println(new StringBuilder(string).reverse().toString());
	}
	
}
