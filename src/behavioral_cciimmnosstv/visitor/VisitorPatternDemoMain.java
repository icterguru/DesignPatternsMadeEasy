/**
 *
 */
package behavioral_cciimmnosstv.visitor;

/**
 * @author HossaiM
 * <br>
 * http://www.tutorialspoint.com/design_pattern/visitor_pattern.htm
 */
public class VisitorPatternDemoMain {
	public static void main(String[] args) {

	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	   }
}
