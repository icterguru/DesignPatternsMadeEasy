/**
 *
 */
package behavioral_cciimmnosstv.statePattern;

/**
 * @author HossaiM
 *<br>
 * http://www.tutorialspoint.com/design_pattern/state_pattern.htm
 */
public class StatePatternDemoMain {
	public static void main(String[] args) {
		StateContext context = new StateContext();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}
}
