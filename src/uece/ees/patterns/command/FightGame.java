/**
 * 
 */
package uece.ees.patterns.command;

/**
 * @author thuan.nabuco
 * 
 */
public class FightGame implements JoystickCommand {

	@Override
	public void pressButton(Joystick joystick) {
		joystick.pressButtonA();
		System.out.println("high kick");

	}

}
