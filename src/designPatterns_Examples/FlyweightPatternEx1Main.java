import java.util.HashMap;

interface IFlwShape {
	void draw();
}

class FlwCircle implements IFlwShape{
	private String color;
	   private int x;
	   private int y;
	   private int radius;

	   public FlwCircle(String color){
	      this.color = color;
	   }

	   public void setX(int x) {
	      this.x = x;
	   }

	   public void setY(int y) {
	      this.y = y;
	   }

	   public void setRadius(int radius) {
	      this.radius = radius;
	   }

	   @Override
	   public void draw() {
	      System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
	   }
}

class FlwShapeFactory {
	 private static final HashMap<String, IFlwShape> circleMap = new HashMap();

	   public static IFlwShape getCircle(String color) {
	      FlwCircle circle = (FlwCircle)circleMap.get(color);

	      if(circle == null) {
	         circle = new FlwCircle(color);
	         circleMap.put(color, circle);
	         System.out.println("Creating circle of color : " + color);
	      }
	      return circle;
	   }
}

public class FlyweightPatternEx1Main {
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
	   public static void main(String[] args) {

	      for(int i=0; i < 20; ++i) {
	         FlwCircle circle = (FlwCircle)FlwShapeFactory.getCircle(getRandomColor());
	         circle.setX(getRandomX());
	         circle.setY(getRandomY());
	         circle.setRadius(100);
	         circle.draw();
	      }
	   }
	   private static String getRandomColor() {
	      return colors[(int)(Math.random()*colors.length)];
	   }
	   private static int getRandomX() {
	      return (int)(Math.random()*100 );
	   }
	   private static int getRandomY() {
	      return (int)(Math.random()*100);
	   }

}
