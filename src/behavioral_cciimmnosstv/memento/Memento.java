/**
 *
 */
package behavioral_cciimmnosstv.memento;

/**
 * @author HossaiM
 *
 */
public class Memento {
	private String state;

	   public Memento(String state){
	      this.state = state;
	   }

	   public String getState(){
	      return state;
	   }
}
