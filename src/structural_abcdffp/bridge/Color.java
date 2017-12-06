package structural_abcdffp.bridge;

public class Color extends ShapeBridge {
	public Color(IShapeBP shapeAPI) {
		super(shapeAPI);
	}

	@Override
	public void drawShape_ShapeBridge() {
		// DO NOTHING

	}

	@Override
	public void fillColor_ShapeBridge() {
		System.out.println("Inside the public class Color extends ShapeBridge fillColor_ShapeBridge().");
		iShape.shapeColor_IShape();

	}
}