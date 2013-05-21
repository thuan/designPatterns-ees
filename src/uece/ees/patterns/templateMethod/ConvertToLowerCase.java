package uece.ees.patterns.templateMethod;

public class ConvertToLowerCase extends ConvertTemplate {

	@Override
	void converter(String string) {
		System.out.println(string.toLowerCase());
	}

}
