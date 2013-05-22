/**
 * 
 */
package uece.ees.patterns.command;

/**
 * @author thuan.nabuco
 * 
 */
public class Joystick {
	private boolean buttonA;
	private boolean buttonB;

	public boolean isButtonA() {
		return buttonA;
	}

	public void setButtonA(boolean buttonA) {
		this.buttonA = buttonA;
	}

	public boolean isButtonB() {
		return buttonB;
	}

	public void setButtonB(boolean buttonB) {
		this.buttonB = buttonB;
	}

	protected void pressButtonA() {
		setButtonA(true);
		System.out.println("buttonA pressed");
	}

	protected void pressButtonB() {
		setButtonB(true);
		System.out.println("buttonB pressed");
	}
}
