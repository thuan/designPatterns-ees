package uece.ees.patterns.templateMethod;

public class ConvertToUpperCase extends ConvertTemplate {

	@Override
	void converter(String string) {
		System.out.println(string.toUpperCase());
	}

}
