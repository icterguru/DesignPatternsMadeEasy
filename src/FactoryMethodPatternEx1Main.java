
interface IShapeFP {

/**
 * @author HossainM
 *  Declared inside the IShape interface ....
 * <br>
 * The {@code drawShape()} method will call the overriden {@code drawShape()} method .... </p> and  <br> bla bla ...
 */
	void drawShapeFP();
}

class CircleFP implements IShapeFP {

/**
 * @author HossaiM
 *
 */


	@Override
	public void drawShapeFP() {
		System.out.println("Inside the CricleFP.drawShape()..");

	}

}

class EllipseFP implements IShapeFP{

	@Override
	public void drawShapeFP() {
		System.out.println("Inside the EllipseFP.drawShape()..");

	}

}

class RectangleFP implements IShapeFP {

	@Override
	public void drawShapeFP() {
		System.out.println("Inside the RectangleFP.drawShape()..");

	}

}

class SquareFP implements IShapeFP {

	@Override
	public void drawShapeFP() {
		System.out.println("Inside the SquareFP.drawShape()..");

	}

}

class ShapeFactoryFP {
/**
 * @author HossaiM
 * <p>
 * /** Defined inside the ShapeFactory class
 * <br>
 * The {@code ShapeFactory()} method will call the {@code ShapeFactory()} <br> method </p> and  <br> bla bla ...
 *
 *
 */

	public IShapeFP getShapeFP(String shape){
		// This is the Factory Method
		if(shape ==null)
			return null;
		if(shape .equalsIgnoreCase("Circle"))
			return new CircleFP();
		else if (shape.equalsIgnoreCase("Ellipse"))
			return new EllipseFP();
		else if(shape .equalsIgnoreCase("Rectangle"))
			return new RectangleFP();
		else if(shape .equalsIgnoreCase("Square"))
			return new SquareFP();

		return null;

	}

}



public class FactoryMethodPatternEx1Main {

	public static void main(String[] args) {

		ShapeFactoryFP shapeFactory = new ShapeFactoryFP();

		IShapeFP shapeCircle = shapeFactory.getShapeFP("Circle");
		shapeCircle.drawShapeFP();
		IShapeFP ellipse = shapeFactory.getShapeFP("eLLipse");
		ellipse.drawShapeFP();

		IShapeFP shapeRectangle = shapeFactory.getShapeFP("Rectangle");
		shapeRectangle.drawShapeFP();


		IShapeFP shapeSquare = shapeFactory.getShapeFP("Square");
		shapeSquare.drawShapeFP();

	}

}
