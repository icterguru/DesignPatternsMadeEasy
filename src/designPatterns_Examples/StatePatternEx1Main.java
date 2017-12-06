
/**
 * @author HossaiM
 * <br>
 * http://www.tutorialspoint.com/design_pattern/state_pattern.htm
 */
interface State {
	public void doAction(StateContext context);
}


class StateContext {
	private State state;

	   public StateContext(){
	      state = null;
	   }

	   public void setState(State state){
	      this.state = state;
	   }

	   public State getState(){
	      return state;
	   }
}

class StartState implements State {

	   public void doAction(StateContext context) {
	      System.out.println("Player is in start state");
	      context.setState(this);
	   }

	   public String toString(){
	      return "Start State";
	   }
	}

class StopState implements State {

	   public void doAction(StateContext context) {
	      System.out.println("Player is in stop state");
	      context.setState(this);
	   }

	   public String toString(){
	      return "Stop State";
	   }
	}

public class StatePatternEx1Main {
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