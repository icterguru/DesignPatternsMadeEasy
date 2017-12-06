package structural_abcdffp.bridge;

public class Triangle implements IShapeBP {

	@Override
	public void shapeType_IShape() {
		System.out.println("Inside the  public class Triangle implements IShape shapeType_IShape()..");

	}

	@Override
	public void shapeColor_IShape() {
		// DO NOTHING
		System.out.println("Inside the public class Square implements IShape shapeColor_IShape()..");
	}

}
