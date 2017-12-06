package creational_fasbp.factoryMethodPattern;

public class FactoryMethodPatternMain {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		IShape shapeCircle = shapeFactory.getShape("Circle");
		shapeCircle.drawShape();
		IShape ellipse = shapeFactory.getShape("eLLipse");
		ellipse.drawShape();

		IShape shapeRectangle = shapeFactory.getShape("Rectangle");
		shapeRectangle.drawShape();


		IShape shapeSquare = shapeFactory.getShape("Square");
		shapeSquare.drawShape();

	}

}
