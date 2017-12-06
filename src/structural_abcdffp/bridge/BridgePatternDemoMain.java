/**
 *
 */
package structural_abcdffp.bridge;

/**
 * @author HossaiM
 *
 */
public class BridgePatternDemoMain {

	public static void main(String[] args) {

		ShapeBridge square = new ShapeB(new Square());
		ShapeBridge triangle = new ShapeB(new Triangle());
		square.drawShape_ShapeBridge();
		System.out.println("test..");
		triangle.drawShape_ShapeBridge();

		ShapeBridge blueTriangle = new Color(new BlueTriangle());

		//blueTriangle.fillColor_ShapeBridge();

		blueTriangle.iShape.shapeType_IShape();
		blueTriangle.iShape.shapeColor_IShape();

		ShapeBridge redTriangle = new Color(new RedTriangle());

		//redTriangle.fillColor_ShapeBridge();

		redTriangle.iShape.shapeType_IShape();
		redTriangle.iShape.shapeColor_IShape();

	}

}
