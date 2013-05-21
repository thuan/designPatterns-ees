/**
 * 
 */
package uece.ees.patterns.templateMethod;

/**
 * @author thuan.nabuco
 *
 */
public class ConvertToCopy extends ConvertTemplate {

	@Override
	void converter(String string) {
		String stringClone = new String(string);
		System.out.println(string + " " + stringClone);
	}

}
