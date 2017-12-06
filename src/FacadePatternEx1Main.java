
interface IShape {
	void drawShape();
}

class Circle implements IShape {
	@Override
	public void drawShape() {
		System.out.println("IShape:: Circle");
	}

}

class Rectangle implements IShape {

	@Override
	public void drawShape() {
		System.out.println("IShape:: Rectangle");
	}
}

class Square implements IShape {

	@Override
	public void drawShape() {
		System.out.println("IShape:: Square");
	}

}
class ShapeMaker {
	   private Circle circle;
	   private Rectangle rectangle;
	   private Square square;

	   public ShapeMaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      square = new Square();
	   }

	   public void drawCircle(){
	      circle.drawShape();
	   }
	   public void drawRectangle(){
	      rectangle.drawShape();
	   }
	   public void drawSquare(){
	      square.drawShape();
	   }
	}



public class FacadePatternEx1Main {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}