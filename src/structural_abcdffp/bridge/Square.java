package structural_abcdffp.bridge;

public class Square implements IShapeBP {

	@Override
	public void shapeType_IShape() {
		System.out.println("Inside the public class Square implements IShape shapeType_IShape()..");

	}

	@Override
	public void shapeColor_IShape() {
		System.out.println("Inside the public class Square implements IShape shapeColor_IShape()..");
//		DO NOTHING
	}

}
