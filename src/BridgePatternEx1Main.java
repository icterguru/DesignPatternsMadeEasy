
/**
 * @author HossaiM
http://stackoverflow.com/questions/17015997/bridge-pattern-understanding

The relationship between IShape and ShapeBridge is called a Bridge.

The bridge is between IShape and Shape via ShapeBridge.

**/

interface IMyShape {
	   public void shapeType_IShape();
	   public void shapeColor_IShape();
	}

	class BrSquare implements IMyShape {

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

class BrTriangle implements IMyShape {

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


abstract class ShapeBridge {
	// This is the Shape Bridge
	   protected IMyShape iShape;

	   protected ShapeBridge(IMyShape drawShape){
	      this.iShape = drawShape;
	   }

	   protected abstract void drawShape_ShapeBridge();
	   protected abstract void fillColor_ShapeBridge();
	}


	class Color extends ShapeBridge {
	public Color(IMyShape shapeAPI) {
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

	class Shape extends ShapeBridge {
		public Shape(IMyShape shapeAPI) {
			super(shapeAPI);
		}

		@Override
		public void drawShape_ShapeBridge() {
			System.out.println("Inside the public class Shape extends ShapeBridge drawShape_ShapeBridge.");
			iShape.shapeType_IShape();

		}

		@Override
		public void fillColor_ShapeBridge() {
//			DO NOTHING

		}
	}

class BlueTriangle implements IMyShape {

	@Override
	public void shapeType_IShape() {
		System.out.println("Inside the  public class BlueTriangle implements IShape shapeType_IShape()..");

	}

	@Override
	public void shapeColor_IShape() {
		System.out.println("Inside the  public class BlueTriangle implements IShape shapeColor_IShape()..");
	}

}

class RedTriangle implements IMyShape {

	@Override
	public void shapeType_IShape() {
		System.out.println("Inside the  public class RedTriangle implements IShape shapeType_IShape()..");

	}

	@Override
	public void shapeColor_IShape() {
		System.out.println("Inside the  public class RedTriangle implements IShape shapeColor_IShape()..");
	}

}

public class BridgePatternEx1Main {

	public static void main(String[] args) {

		ShapeBridge square = new Shape(new BrSquare());
		ShapeBridge triangle = new Shape(new BrTriangle());
		square.drawShape_ShapeBridge();
		System.out.println("test..");
		triangle.drawShape_ShapeBridge();

		ShapeBridge blueTriangle = new Color(new BlueTriangle());

		//blueTriangle.fillColor_ShapeBridge();

		blueTriangle.iShape.shapeType_IShape();
		blueTriangle.iShape.shapeColor_IShape();

		ShapeBridge redTriangle = new Color(new RedTriangle());

		redTriangle.fillColor_ShapeBridge();

		redTriangle.iShape.shapeType_IShape();
		redTriangle.iShape.shapeColor_IShape();

	}

}
