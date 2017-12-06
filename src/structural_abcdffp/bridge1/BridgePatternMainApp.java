/**
 *
 */
package structural_abcdffp.bridge1;

/**
 * @author HossaiM
 *
 */
public class BridgePatternMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DrawShapeBridge redCircle = new Circle(100,100, 10, new RedCircle());
	      DrawShapeBridge greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();

	}

}
