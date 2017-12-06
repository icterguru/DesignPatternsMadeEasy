package structural_abcdffp.bridge;

public class ShapeB extends ShapeBridge {
	public ShapeB(IShapeBP shapeAPI) {
		super(shapeAPI);
	}

	@Override
	public void drawShape_ShapeBridge() {
		System.out.println("Inside the public class Shape extends ShapeBridge drawShape_ShapeBridge.");
		iShape.shapeType_IShape();

	}

	@Override
	public void fillColor_ShapeBridge() {
//		DO NOTHING

	}
}