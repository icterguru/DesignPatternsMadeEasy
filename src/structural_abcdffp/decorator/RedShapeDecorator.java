package structural_abcdffp.decorator;

public class RedShapeDecorator  extends ShapeDecorator{

	public RedShapeDecorator(IShape decoratedShape) {
		super(decoratedShape); // Auto-generated
	}

	@Override
	   public void drawShape() {
	      decoratedShape.drawShape();
	      setRedBorder(decoratedShape);
	   }

	   private void setRedBorder(IShape decoratedShape){
	      System.out.println("Border Color: Red");
	   }

}
