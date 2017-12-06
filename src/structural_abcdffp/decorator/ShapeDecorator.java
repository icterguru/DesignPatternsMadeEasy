package structural_abcdffp.decorator;

public abstract class ShapeDecorator implements IShape {

	protected IShape decoratedShape;

	public ShapeDecorator(IShape decoratedShape){
		this.decoratedShape = decoratedShape;

	}

	@Override
	public void drawShape() {
		decoratedShape.drawShape();
	}

}
