package behavioral_cciimmnosstv.mediator;

/**
 * @author HossaiM
 * <br>
 * http://www.tutorialspoint.com/design_pattern/mediator_pattern.htm
 *
 */

public class MediatorPatternMain {
	public static void main(String[] args) {
		User robert = new User("Mokter ");
		User john = new User(" Hossain");

		robert.sendMessage("Hi! Dr. Mokter!");
		john.sendMessage("Hello! Dr. Hossain!!");
	}
}
