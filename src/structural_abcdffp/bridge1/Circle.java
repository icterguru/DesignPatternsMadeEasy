package structural_abcdffp.bridge1;

public class Circle extends DrawShapeBridge {
	   private int x, y, radius;

	   public Circle(int x, int y, int radius, DrawAPI drawShapeAPI) {
	      super(drawShapeAPI);
	      this.x = x;
	      this.y = y;
	      this.radius = radius;
	   }

	   public void draw() {
	      drawAPI.drawCircle(radius,x,y);
	   }
	}